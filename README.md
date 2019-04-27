# BlurImageView
一行代码搞定高斯模糊<br/>
1.之前写过一篇图片设置高斯模糊的[文章](https://blog.csdn.net/qq_32239767/article/details/89528128)，鉴于没有在GitHub上找到合适的库，自己就拷贝百度代码做了个小的工具类，今天又花功夫对这个工具类进行了扩充，重载了BoxBlurFilter()方法，使用者可以通过资源文件图片、bitmap、drawable、甚至是直接通过网络图片(已做异步处理，无需再开子线程，直接给个对应的网址就完事)来进行设置。如果觉得用的还好的话，可以去[GitHub仓库](https://github.com/zb-tjw/BlurImageView)上给我点个<font color="red">**Star**</font>，如果遇到问题，或者bug，请底下回复留言
<br/>
2.下边来说一说用法
### How to
-------
#### 1.gradle:
To get a Git project into your build:<br/>
**Step 1.** Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
**Step 2.** Add the dependency

```
dependencies {
	        implementation 'com.github.zb-tjw:BlurImageView:2.0'
	}
```
#### 2.maven:
To get a Git project into your build:<br/>
**Step 1.** Add the JitPack repository to your build file

```
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
**Step 2.** Add the dependency

```
<dependency>
	    <groupId>com.github.zb-tjw</groupId>
	    <artifactId>BlurImageView</artifactId>
	    <version>2.0</version>
	</dependency>
```
3.方法调用：
+ 如果你的参数是bitmap：<br/>
`image.setBackground(BoxBlurFilter(bmp));`
+ 如果你的参数是drawable：<br/>
`image.setBackground(BoxBlurFilter(drawable));`
+ 如果你的参数是资源文件下的某张图片：`image.setBackground(BoxBlurFilter(MainActivity.this,R.mipmap.zb_tjw));`
+ 如果你的参数是一个网络图片地址：<br/>
`private String url = "https://img-blog.csdnimg.cn/.........";`<br/>
`AsyncloadImage asyncloadImage = new AsyncloadImage();`<br/>
`asyncloadImage.execute(url,image1);`<br/>
**无需再自己开子线程，已做异步处理**
+ 如果你想改高斯模糊的清晰度：<br/>
`BlurImageView.HRADIUS = 1;`<br/>
`BlurImageView.ITERATIONS= 1;`<br/>
`BlurImageView.VRADIUS = 1;`<br/>
**数值越小越清晰**
 4.欢迎点赞和评论，有问题也可一起交流：[**GitHub仓库地址**](https://github.com/zb-tjw/BlurImageView)
