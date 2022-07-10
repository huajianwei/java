import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.rmi.RemoteException;
import java.util.Scanner;

import javax.sound.sampled.Line;

public class myScanner{
    public static void main(String[] args) {


        test2();
        // try {
        //     test();
        // } catch (RemoteException e) {
        //     System.out.println("remote Exception");
        // }finally{
        //     System.out.println("final");
        // }

        // Scanner sc = new Scanner(System.in);
        // if(sc.hasNext()){
        //     String str = sc.next();
        //     System.out.println(str);
        // }  
        // sc.close(); 
    }
    static void  test()  throws RemoteException {
        System.out.println("test");
        throw new RemoteException();
    }

    /**
     * try- catch 读取文件
     * try with resource
     */
    static void test1(){
        String line;
        try ( BufferedReader br = new BufferedReader( new FileReader("/Users/adam/Desktop/adam/javaDemo/javaDemo/src/test.txt"))){
            
            while ((line = br.readLine())  != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("IOException in try" + e.getMessage());
        }
    }

    static void test2(){

        BufferedReader br = null;
        String line;

        try {
            br = new BufferedReader(new FileReader("/Users/adam/Desktop/adam/javaDemo/javaDemo/src/test.txt"));
            while((line = br.readLine())  != null){
                System.out.println(line);
            }

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("IOException" + e.getMessage());
        }finally{
            try{
                if (br != null){
                    br.close();
                }
            }catch(IOException e){
                System.out.println("io" + e.getMessage());
            }
        }
    }
}