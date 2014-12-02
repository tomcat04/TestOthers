/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.others.nio;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author cgx1844568
 * @date 2014-12-1
 * @time 9:53:41
 *
 */
public class MySelector {

    private final int port = 8080;
    private SocketAddress address = null;
    private Selector selector;
    /**
     * 注册事件
     * @return 
     */
    protected Selector initSelector() throws IOException{
        //创建selector对象
        selector = Selector.open();
        
        //创建可选择通道,设置为非阻塞
        ServerSocketChannel server = ServerSocketChannel.open();
        server.configureBlocking(false);
        
        //绑定通道到指定端口
        ServerSocket socket = server.socket();
        address = new InetSocketAddress(port);
        socket.bind(address);
        
        //向selector中注册事件
        server.register(selector, SelectionKey.OP_ACCEPT);
        return selector;
    }
    
    /**
     * 监听
     * @throws java.io.IOException
     */
    public void listen() throws IOException{
        System.out.println("listen on port : " + port);
        while(true){
            selector.select();
            Set<SelectionKey> keys = selector.selectedKeys();
            Iterator<SelectionKey> iter = keys.iterator();
            while(iter.hasNext()){
                SelectionKey key = iter.next();
                iter.remove();
                process(key);
            }
        }
    }
    
    /**
     * 处理事件
     * @param key
     */
    protected void process(SelectionKey key){
        
        //接收请求
        if(key.isAcceptable()){
        }
        //读信息
        else if(key.isReadable()){
        }
        //写事件
        else if(key.isWritable()){
        }
        //可连接
        else if(key.isConnectable()){
        }
        //可用
        else if(key.isValid()){
        }
    }
    
    public static void acceptConnections( int port) throws Exception {
       // 打开一个 Selector
       Selector acceptSelector =
           SelectorProvider.provider().openSelector();
 
       // 创建一个 ServerSocketChannel ，这是一个 SelectableChannel 的子类
       ServerSocketChannel ssc = ServerSocketChannel.open();
       // 将其设为 non-blocking 状态，这样才能进行非阻塞 IO 操作
       ssc.configureBlocking( false );
 
       // 给 ServerSocketChannel 对应的 socket 绑定 IP 和端口
       InetAddress lh = InetAddress.getLocalHost();
       InetSocketAddress isa = new InetSocketAddress(lh, port);
       ssc.socket().bind(isa);
 
       // 将 ServerSocketChannel 注册到 Selector 上，返回对应的 SelectionKey
       SelectionKey acceptKey =
           ssc.register(acceptSelector, SelectionKey.OP_ACCEPT);
 
       int keysAdded = 0;
 
       // 用 select() 函数来监控注册在 Selector 上的 SelectableChannel
       // 返回值代表了有多少 channel 可以进行 IO 操作 (ready for IO)
       while ((keysAdded = acceptSelector.select()) > 0) {
           // selectedKeys() 返回一个 SelectionKey 的集合，
           // 其中每个 SelectionKey 代表了一个可以进行 IO 操作的 channel 。
           // 一个 ServerSocketChannel 可以进行 IO 操作意味着有新的 TCP 连接连入了
           Set readyKeys = acceptSelector.selectedKeys();
           Iterator i = readyKeys.iterator();
 
           while (i.hasNext()) {
              SelectionKey sk = (SelectionKey) i.next();
              // 需要将处理过的 key 从 selectedKeys 这个集合中删除
              i.remove();
              // 从 SelectionKey 得到对应的 channel
              ServerSocketChannel nextReady =
                  (ServerSocketChannel) sk.channel();
              // 接受新的 TCP 连接
              Socket s = nextReady.accept().socket();
              // 把当前的时间写到这个新的 TCP 连接中
              PrintWriter out =
                  new PrintWriter(s.getOutputStream(), true );
              Date now = new Date();
              out.println(now);
              // 关闭连接
              out.close();
           }
        }
    }
}
