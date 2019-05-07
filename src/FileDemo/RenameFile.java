package FileDemo;

import java.io.File;
import java.util.Arrays;

public class RenameFile {


    public static void main(String[] args) {
        File file = new File("E:\\QQ接受文件\\31806253\\FileRecv\\按要求命名\\1");
        File[] list = file.listFiles();
        for (int i = 0; i <list.length ; i++) {
            File file1 = list[i];
            String name = file1.getName();
            //方案1-定码轮换
            int bigen =name.indexOf("方案")+2;
            int end =name.indexOf("-");
            int number =Integer.valueOf(name.substring(bigen, end));
            Integer integer = Integer.valueOf(name.substring(bigen, end))+1008;
            String names=name.replace(String.valueOf(number),integer.toString());
            System.out.println(name+"----"+names);
            file1.renameTo(new File("E:\\QQ接受文件\\31806253\\FileRecv\\按要求命名\\1\\"+names));
        }
    }
}
