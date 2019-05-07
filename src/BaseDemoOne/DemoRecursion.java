package BaseDemoOne;

import java.io.File;
import java.io.FileFilter;

public class DemoRecursion {

    public static void main(String[] args) {

        new Thread(()-> System.out.println("线程运行")).start();

        //递归练习

        Integer sum = getSum(9);
        System.out.println(sum);
        Integer f =getFactorial(1,1);
        System.out.println(f);
        getFilename("C:\\Users\\lzx\\Documents\\Upupoo\\Docker");
    }
    //1-n 相加
    public static Integer getSum(Integer num){
        if (num.equals(1)){
            return 1;
        }else{
            return  num+getSum(num-1);
        }
    }
    //n的阶乘想家 n*(n-1)+n*(n-2)
    public  static  Integer getFactorial(Integer n,Integer c){
        if (n.equals(c)){
            return n;
        }
        int temp=n*(n-c);
        if (c==n-1){
            return  n*(n-c);
        }
        return  temp+getFactorial(n,c+1);

    }

    public  static  File getFilename(String filePath){
        File file = new File(filePath);
        if (file.isDirectory()){
            System.out.println(file.toString());
            File[] files = file.listFiles((File pathname)-> pathname.toString().toLowerCase().endsWith(".exe"));
            for (File f:files) {
                getFilename(f.toString());
            }
        }else{
            System.out.println(file.toString());
            return file;
        }
        return  null;
    }
}
