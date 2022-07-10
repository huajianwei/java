import java.io.*;

public class mytest1{
    public static void main(String[] args) throws IOException  {
        System.out.println("hello,java");

        // String str;

        // BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        // do{

        //     str = br.readLine();
        //     System.out.println(str);
        // }while(!str.equals("end"));


        File f = new File("/Users/adam/Desktop/adam/javaDemo/javaDemo/src/test.txt");
        OutputStream fin = new FileOutputStream(f);

        OutputStreamWriter writer = new OutputStreamWriter(fin, "UTF-8");

        byte b[] = {11,22,33};
        writer.append("hello");
        
        writer.close();

    }
}