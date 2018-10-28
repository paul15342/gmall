package com.atguigu.gmall.manager;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallManagerWebApplicationTests {

    @Test
    public void contextLoads () throws IOException, Exception {

        String str = "adcde";
        String substring = str.substring(1);
        System.err.println(substring);

        String substring1 = str.substring(1, 3);
        System.err.println(substring1);

       /* String path = GmallManagerWebApplicationTests.class.getResource("/tracker.conf").getPath();

        ClientGlobal.init(path);

        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = trackerClient.getConnection();

        StorageClient storageClient = new StorageClient(trackerServer, null);
        String[] file = storageClient.upload_file("d:/a.jpg", "jpg", null);

        System.err.println(file[0]+file[1]);*/

    }

}
