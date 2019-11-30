import com.cwh.rpc.client.RpcImporter;
import com.cwh.rpc.service.RpcExporter;
import com.cwh.service.EchoService;
import com.cwh.service.impl.EchoServiceImpl;

import java.net.InetSocketAddress;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    RpcExporter.exporter("localhost",8099);
                }catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

        }).start();

        RpcImporter<EchoService> importer = new RpcImporter<EchoService>();
        EchoService echo = importer.importer(EchoServiceImpl.class,new InetSocketAddress("localhost",8099));
        System.out.println(echo.echo("Are you ok?"));
        System.out.println(echo.login("Are you login?"));
        System.out.println(echo.logout("Are you logout?"));

    }
}
