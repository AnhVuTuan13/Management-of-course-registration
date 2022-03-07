    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBEngine;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *

 */
public class DBEngine {
 
public void LuuFile(String fileName, Object obj) 
        throws Exception{
    //Tạo luồng ghi file
    FileOutputStream fs=new FileOutputStream(fileName);
    //Tạo luồng để serial đối tượng
    ObjectOutputStream os=new ObjectOutputStream(fs);
    //chuyển tải đối tượng tới đích (tập tin)
    os.writeObject(obj);
    //đóng luồng
    fs.close();
    os.close();
}

public Object docFile(String fileName) throws Exception{
    Object kq=null;
    //Tạo luồng đọc file 
    FileInputStream fi=new FileInputStream(fileName);
    //Tạo luồng để Deserialize đối tượng
    ObjectInputStream ois=new ObjectInputStream(fi);
    //Tiến hành khôi phục đối tượng
    kq=ois.readObject();
    //đóng luồng
    fi.close();ois.close();
    return kq;
}
   
}
