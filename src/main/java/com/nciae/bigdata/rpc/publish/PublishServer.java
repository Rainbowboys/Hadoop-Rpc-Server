package com.nciae.bigdata.rpc.publish;

import com.nciae.bigdata.rpc.LoginServerProtocolInterface;
import com.nciae.bigdata.rpc.LoginServerProtocolSystem;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.RPC.Builder;
import org.apache.hadoop.ipc.RPC.Server;

import java.io.IOException;


/**
 * 发布服务等在客服端连接
 */
public class PublishServer {


    public static void main(String[] args) throws IOException {

        Configuration conf = new Configuration();
        Builder builder = new RPC.Builder(conf);
        builder.setPort(Integer.parseInt(args[0])).setProtocol(LoginServerProtocolInterface.class)
                .setInstance(new LoginServerProtocolSystem())
                .setBindAddress(args[1]);
        Server server = builder.build();
        server.start();
    }
}
