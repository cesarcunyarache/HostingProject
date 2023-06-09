package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Conexion;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Picture;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.common.IOUtil;

public class Reporte {

    public static void main(String args[]) {
        reporte();
    }

    public static void reporte() {

        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet("Habitaciones");

        try {
            InputStream is = new FileInputStream("src/img/tienda.jpg");
            byte[] bytes = IOUtils.toByteArray(is);
            int imgIndex = book.addPicture(bytes, Workbook.PICTURE_TYPE_JPEG);
            is.close();

            CreationHelper help = book.getCreationHelper();
            Drawing draw = sheet.createDrawingPatriarch();

            ClientAnchor anchor = help.createClientAnchor();
            anchor.setCol1(0);
            anchor.setRow1(1);
            Picture pict = draw.createPicture(anchor, imgIndex);
            pict.resize(1, 3);

            CellStyle tituloEstilo = book.createCellStyle();
            tituloEstilo.setAlignment(HorizontalAlignment.CENTER);
            tituloEstilo.setVerticalAlignment(VerticalAlignment.CENTER);
            Font fuenteTitulo = book.createFont();
            fuenteTitulo.setFontName("Arial");
            fuenteTitulo.setBold(true);
            fuenteTitulo.setFontHeightInPoints((short) 14);
            tituloEstilo.setFont(fuenteTitulo);

            Row filaTitulo = sheet.createRow(1);
            Cell celdaTitulo = filaTitulo.createCell(1);
            celdaTitulo.setCellStyle(tituloEstilo);
            celdaTitulo.setCellValue("Reporte de ocupación de Habitacion");

            sheet.addMergedRegion(new CellRangeAddress(1, 2, 1, 3));

            String[] cabecera = new String[]{"Tipo de Habitacion", "Total de Habitaciones", "Habitaciones ocupadas", "Porcentaje de ocupacion"};

            CellStyle headerStyle = book.createCellStyle();
            headerStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
            headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            headerStyle.setBorderBottom(BorderStyle.THIN);
            headerStyle.setBorderLeft(BorderStyle.THIN);
            headerStyle.setBorderRight(BorderStyle.THIN);
            headerStyle.setBorderBottom(BorderStyle.THIN);

            Font font = book.createFont();
            font.setFontName("Arial");
            font.setBold(true);
            font.setColor(IndexedColors.WHITE.getIndex());
            font.setFontHeightInPoints((short) 12);
            headerStyle.setFont(font);

            Row filaEncabezados = sheet.createRow(4);

            for (int i = 0; i < cabecera.length; i++) {
                Cell celdaEnzabezado = filaEncabezados.createCell(i);
                celdaEnzabezado.setCellStyle(headerStyle);
                celdaEnzabezado.setCellValue(cabecera[i]);
            }

            Conexion con = new Conexion();
            PreparedStatement ps;
            ResultSet rs;
            Connection conn = con.getConexion();

            int numFilaDatos = 5;

            CellStyle datosEstilo = book.createCellStyle();
            datosEstilo.setBorderBottom(BorderStyle.THIN);
            datosEstilo.setBorderLeft(BorderStyle.THIN);
            datosEstilo.setBorderRight(BorderStyle.THIN);
            datosEstilo.setBorderBottom(BorderStyle.THIN);

            ps = conn.prepareStatement("SELECT\n"
                    + "    th.nombre AS 'Tipo de habitación',\n"
                    + "    COUNT(h.numHabitacion) AS 'Total de habitaciones',\n"
                    + "    COUNT(CASE WHEN rh.idRegistro IS NOT NULL THEN 1 END) AS 'Habitaciones ocupadas',\n"
                    + "    CAST(CAST(COUNT(CASE WHEN rh.idRegistro IS NOT NULL THEN 1 END) AS decimal) / COUNT(h.numHabitacion) * 100  AS DECIMAL(10, 2)) AS 'Porcentaje de ocupación'\n"
                    + "FROM\n"
                    + "    Habitacion h\n"
                    + "    INNER JOIN TipoHabitacion th ON h.tipoHabitacionID = th.idTipo\n"
                    + "    LEFT JOIN RegistroHabitacion rh ON h.numHabitacion = rh.idHabitacion\n"
                    + "GROUP BY\n"
                    + "    th.nombre;");
            rs = ps.executeQuery();

            int numCol = rs.getMetaData().getColumnCount();

            while (rs.next()) {
                Row filaDatos = sheet.createRow(numFilaDatos);

                for (int a = 0; a < numCol; a++) {

                    Cell CeldaDatos = filaDatos.createCell(a);
                    CeldaDatos.setCellStyle(datosEstilo);

                    if (a == 2 || a == 3) {
                        CeldaDatos.setCellValue(rs.getDouble(a + 1));
                    } else {
                        CeldaDatos.setCellValue(rs.getString(a + 1));
                    }
                }

                //Cell celdaImporte = filaDatos.createCell(4);
                //celdaImporte.setCellStyle(datosEstilo);
                //celdaImporte.setCellFormula(String.format("C%d+D%d", numFilaDatos + 1, numFilaDatos + 1));

                numFilaDatos++;

            }

            sheet.autoSizeColumn(0);
            sheet.autoSizeColumn(1);
            sheet.autoSizeColumn(2);
            sheet.autoSizeColumn(3);
            sheet.autoSizeColumn(4);

            sheet.setZoom(150);

            FileOutputStream fileOut = new FileOutputStream("ReporteProductos.xlsx");
            book.write(fileOut);
            fileOut.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
