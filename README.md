# hdfs

一个分布式视频文件存储播放方案
hadoop
redis
ffmpeg
xuggler
处理步骤：
1.把视频文件上传到hadoop中，同事把转换任务存储到redis队列中
2.读取redis队列，下载相应的视频文件，切割成小段，并上传到hadoop，存储待转换任务到redis
3.集群的机器读取redis待转换任务，下载相应的视频到本机，转换，上传到hadoop
4.判断是否所有文件都已经转换并上传
5.已经转换完成的视频文件，下载所有转换之后的小段到本地，通过ffmpeg连接成一个完整视频
6.把完整的视频上传到hadoop中，分布式转换完成。
