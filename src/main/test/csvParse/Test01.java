package csvParse;

import com.csvreader.CsvReader;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Test01 {

    @Test
    public void test01() throws IOException {

        CsvReader reader = new CsvReader("E:\\西安\\数据文件cvs\\sxdz.csv");

//        CsvWriter write =new CsvWriter(targetFile,',',Charset.forName("UTF-8"));
        //各字段以引号标记
//        write.setForceQualifier(true);
        //路过表头
        //r.readHeaders();
        //逐条读取记录，直至读完
        String[] header = {};
        while (reader.readRecord()) {
            //把头保存起来
            if (reader.getCurrentRecord()==0){
                header = reader.getValues();
            }
            //获取当前记录位置
            System.out.print(reader.getCurrentRecord() + ".");
            //读取一条记录
            System.out.println(new String(reader.getRawRecord().getBytes("GBK"), "UTF-8"));
//            String[] tmp = {reader.getValues()[0],reader.getValues()[1]};
            //修改记录，并只写入第一个字段和第二字段
//            if (!header[1].equals(tmp[1]) && ("".equals(tmp[1])||tmp==null)){
//                tmp[1]="空";
//                write.writeRecord(tmp);
//            }else{
//                write.writeRecord(new String[]{reader.getValues()[0],reader.getValues()[1]});
//            }
        }
        reader.close();
//        write.close();

    }

    @Test
    public void test2() {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        String a = "- 9 - ";
        a = a.replaceAll("\\s+|-","").replaceAll(" ","");
        System.out.println(a);
        System.out.println(pattern.matcher(a).matches());
    }

}