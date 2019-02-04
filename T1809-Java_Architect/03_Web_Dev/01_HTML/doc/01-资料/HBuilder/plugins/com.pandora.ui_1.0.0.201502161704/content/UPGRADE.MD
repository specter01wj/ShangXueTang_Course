Release Notes
===
----[5.3.0.201502161708]----

	* IDE: 【重要】App云打包时错误原因可以查看了
	* IDE: 优化转到定义，css中的#id和js中的class引用也可以跳转了，修复了某些情况跳转样式失败的bug
	* IDE: 解决在iOS真机联调时，批量拷贝资源到项目中报同步异常内存错误的问题
	* IDE: 解决emmet插件快捷键设置不生效的问题
	* IDE: 解决有时出现"内容辅助未完成"、“Index out of bounds”等异常问题
	* IDE: 解决拖入HBuilder的外部文件有时不提示的问题
	* IDE: Mac版HBuilder取消按住 command+双指移动触摸板会放大缩小字体的功能
	* IDE: Mac版HBuilder修正在某些输入法下command+shift+=无法放大字体和 command+shift+-无法首字母大写的问题
	* IDE: 代码助手提示文字颜色时可以直接显示颜色色块
	* IDE: 解决manifest.json可视化界面中，某些情况下修改图标、启动界面后不生效的问题
	* IDE: 解决manifest.json可视化界面中，iPad启动图片不全的问题
	* IDE: 解决html格式化后没有删除多个连续空行的问题
	* IDE: 解决启用php语法验证器后没有生效的问题
	* App: 新增多图片选择，plus.gallery.pick方法补充了相应参数
	* App: 新增plus.webview.getLaunchWebview方法，获取首页WebviewObject窗口对象，不必再通过getWebviewById获取
	* App: 新建WebviewObject对象默认使用url作为id值
	* App: 修复通过parent方法获取的WebviewObject对象id属性值总是为空的问题
	* App: 更新Android平台的支付宝插件，可调用本机已经安装的支付宝钱包
	* App: 修复Android平台在某些机器上无法获取联系人信息的问题
	* App: 修复Android平台在某些情况下提示“Uncaught SyntaxError: Unexpected identifier at list.html:1”错误的问题
	* App: 修复iOS平台在真机运行时无法正确安装wgt文件的问题，可用于单独更新html资源
	* HelloH5+：新增多图片选择示例
	* mui: 修复offcanvas偶发性出现菜单不能自动关闭的问题
	* mui: 修复offcanvas中输入类控件无法focus的问题
	* mui: 修复可拖动式选项卡点击切换偶尔出现丢失选项卡标题的问题
	* mui: 修复Android 5.0版本下，hello-mui首页滚动时，经常触发显示"cancel a touch move"的日志信息
	* mui: 修复iOS平台下当list数据过多，swipeout菜单引起crash的bug
	* mui: 修复Android 4.4以下版本，input type=number控件宽度不是100%的问题
	* mui: hello mui支持“双击顶部、列表滚到顶部”功能
	恭祝大家新春快乐，喜气羊羊过大年！添加微信DCloud_IO领红包！

----[5.2.6.201502022444]----

	* App: 修复Android平台actionSheet上设置2个按钮时无法正常显示的问题
	* App: 修复Android平台多次调用WebviewObject窗口对象的setBounce方法可能导致显示不正常的问题
	* App: 修复iOS平台从屏幕左边侧滑返回时页面可能上下滚动的问题，详情参考http://ask.dcloud.net.cn/article/158
	* App: 修复Android平台pickDate选择2月份时返回月份值错误的问题
	* App: 修复Android平台打开二维码扫描页面长时间后可能会导致程序异常的问题
	* mui: 【重要】解决Android4.4版本以下，resume后顶部标题延迟渲染造成白屏的问题
	* mui: mui.init中增加beforeback配置，参考：http://dcloudio.github.io/mui/javascript/#closewindow
	* mui: hello mui首页侧滑菜单示例改为更加体现性能优势的控件演示
	* mui: 增加按住（hold）、释放（release）事件支持，参考：http://dcloudio.github.io/mui/javascript/#gesture
	* mui: 解决slider动态生成之前提前初始化导致js错误的问题
	* mui: 优化上下左右滚动时的单向锁定功能
	* mui: 解决.mui-ellipsis-2类中英文混搭无省略号的问题

----[5.2.0.201501260111]----

	* IDE: 【重要】实现js跨文件转到定义
	* IDE: 优化js提示速度，项目过大时，模糊提示部分只提示有明确引用关系的js
	* IDE: js提示时显示该变量所在的js文件（需要重建索引才能生效）
	* IDE: 修复大文档下查找和高亮相同字符变卡的bug
	* IDE: 优化HBuilder启动速度，减少低配电脑启动过慢的问题  
	* IDE: 增强升级的稳定性
	* IDE: 优化代码块提示逻辑，mui和微信代码块只在项目挂载了对应的框架语法库才提示
	* IDE: 【重要】iOS设备的console log可以输出到控制台（plus ready前的日志有可能无法及时显示）
	* IDE: 【重要】MAC电脑上支持调用iOS模拟器，更加方便调试iOS
	* IDE: 【重要】MAC电脑上支持通过safari控制台调试iOS模拟器
	* IDE: 修复若干小bug："在浏览器运行"按钮在多窗口下异常的问题、找回密码后连接打开的邮箱地址错误的问题、windows系统修改"显示->更改所有项目大小"设置后界面显示异常的问题、在js方法前使用/**生成的JSDoc某些情况下不正确的问题	
	* App: Native.js新增获取Webview的原生实例对象API
	* App: Native.js修复Android平台可能无法调用实例对象方法的问题
	* App: Android新增系统原生ActionSheet确认框（plus.nativeUI.actionSheet）
	* App: Android修复AddressBook的find方法查找联系可能返回空内容的问题
	* App: Android修复Webview通过setStyle方法修改属性触发的窗口动画可能无效的问题
	* App: iOS新增系统原生提示消息（plus.nativeUI.toast）
	* App: iOS录音方式新增amr格式。amr是iOS和Android共同支持的录音格式
	* mui: 解决div模式的actionsheet包含switch控件时，switch切换状态异常的bug
	* mui: 解决radio/checkbox在disabled状态下仍可点击切换状态的bug
	* mui: 解决Chrome Emulation环境下，div模式的选项卡中，点击非text的input控件导致底部选项卡位置错乱的bug（http://ask.dcloud.net.cn/question/2475）
	* mui: 解决上拉加载在iOS 8.x系统下拖动较大距离时，无法自动回弹的bug
	* mui: 解决mui-select右侧图标丢失的问题
	* mui: 解决Android平台下拉刷新的webview窗口Id包含“/”时，js异常导致下拉刷新失败的bug
	* mui: webview模式侧滑导航增加“主界面不动、菜单移动”的动画效果
	* mui: 解决ajax请求本地文件失效的bug
	* mui: iOS平台增加原生的toast控件
	* mui: 增加原生模式的Actionsheet控件

----[5.1.0.201501120110]----

	* IDE: 支持新建微信Web应用，可提示微信JS SDK。新建Web项目可选择微信模板
	* IDE: MAC版边改边看增加二维码支持
	* IDE: 优化索引速度
	* IDE: 优化大项目下js提示速度
	* IDE: 代码块支持添加描述
	* IDE: 解决菜单"视图"->"打开透视图"切换透视图时可能报错的问题
	* IDE: 解决css多个元素selector连写(如: html,body,a{})时在大纲视图中显示不正确的问题
	* IDE: 解决有时由于网络或本地缓存导致不能及时升级的问题
	* App: 修复Android平台Webview窗口在隐藏时通过setStyle设置属性无法生效的问题
	* App: 修复Android平台Native.js中无法正确获取对象属性值的问题
	* App: 修复Android平台在360安全扫描提示的https校验建议问题。注意该安全提示并非安全漏洞，也不影响应用上架。此外还存在第三方SDK（如百度地图）的https校验提示，需要第三方SDK修复

----[5.0.0.201501040824]----

	* IDE: 推出JSDoc+，通过扩展的JSDoc规范，实现更强大的语法提示，参考http://ask.dcloud.net.cn/article/129
	* IDE: 优化HBuilder内存占用及回收效率
	* IDE: 修复在构造函数处不提示方法参数的问题
	* IDE: 修复在with里面定义的变量在外部无法提示的问题
	* IDE: 修复JS中某些情况下无法追踪到定义处的问题
	* IDE: 修复JS跨文件引用对象时无法识别类型继承的问题
	* IDE: 优化this类型的提示
	* IDE: 解决有时点击真机调试菜单出现卡顿的问题
	* IDE: 优化Android设备默认存储位置为外置sdcard目录时可能导致真机调试运行后不能显示正确界面的问题
	* IDE: 修改HBuilder升级机制，三天内的新版本不再强制升级，三天后仍将静默升级。同时在官网提供历史版本下载
	* IDE: 增加活动栏目（菜单帮助下），举办2015迎新抽奖活动
	* App: 大幅优化Android性能，低端机开启硬件加速后也可避免花屏
	* App: 自动释放人眼不可见的webview资源，开发者不必再依靠手动hide webview来降低内存占用
	* App: 新增Android5.0 UI支持，nativeUI的控件在Android5上使用OS新样式（不影响Android5以下的UI）
	* App: 新增Webview窗口的遮罩层功能，参考http://ask.dcloud.net.cn/article/130
	* App: 修复Android平台地图隐藏后无法再次正常显示的问题
	* App: 修复Android平台地图在子Webview窗口中定位错误的问题
	* App: 修复Android平台删除plus.storage数据后重启应用后再次出现的问题
	* App: 修复Android平台File调用seek方法不生效的问题
	* App: 修复Android平台在部分设备上嵌套Webview导致软键盘遮住输入框的问题
	* App: 修复Android平台浮动Webview窗口可能不触发标准DOM事件的问题
	* App: 修复Android平台浮动Webview窗口横竖屏切换可能导致显示不正常的问题
	* App: iOS平台新增系统原生弹出菜单ActionSheet控件。参见plus.nativeUI
	* App: 修复iOS平台等待框WaitingOption部分属性不生效的问题
	* HelloH5+：Webview页面添加窗口遮罩示例
	* HelloH5+：NativeUI页面添加actionSheet示例（iOS）
	* App打包: 修复Android平台没有生成个推默认消息图标的问题。
	* mui: Android平台支持可拖动式DIV侧滑菜单
	* mui: Div模式侧滑导航支持“主界面不动、菜单移动”的侧滑菜单动画
	* mui: hello mui首页侧滑后使用原生遮罩，避免多webview遮罩不同步
	* mui: 多个子页面同时支持下拉刷新
	* mui: 修复区域滚动导致Actionsheet跟着一起滚动的bug
	* mui: 修复popover中radioeck点击导致popover关闭的bug
	* mui: 支持slide类控件通过.mui-active样式设定默认显示项
	* mui: 解决Android 4.4.2系统，滑动触发侧滑菜单不灵敏的问题
	* 祝大家2015快乐！2015来了，HTML5来了，HBuilder5来了！

----[4.8.1.201412182433]----

	* 解决使用JQuery后，$()有时不提示选择器的问题
	* App: Android平台修复在部分手机上出现软键盘弹出后自动关闭的问题
	* App: Android平台修复非全屏Webview窗口显示动画效果不对的问题
	* App: Android平台修复Webview设置background属性可能导致程序崩溃的问题
	* App: Android平台修复在部分Android2.3版本机器上预创建Webview窗口会自动显示的问题
	* App: Android平台统一Android平台各版本等待框显示样式

----[4.8.0.201412152314]----

	* 优化android真机调试流程
	* 解决图片达到一定数量时，在js和css中无法提示文件及目录列表的问题
	* 解决代码提示输入数字时，如果输入-也应该用alt+数字选择提示
	* 解决某些操作会导致项目构建停止的问题
	* 解决Mac版HBuilder启动后会在Dock出现两个图标的问题，以及保留在Dock栏状态不正确的问题
	* Mac10.10(Yosemite)版首次启动HBuilder时提示用户下载正确版本的jdk
	* 升级css语法验证器, 解决css语法验证会出现大量误报的问题
	* 解决新建HBuilder窗体无法使用emmet的问题
	* 解决连续移动App打包可能出现文件被占用导致打包失败的问题
	* mui: 优化hello mui中滑动触发列表项体验
	* mui: 优化Actionsheet控件UI样式
	* mui: 解决图片轮播在拖动距离小于1/2屏幕宽度时，依然触发切换下一张图片的bug
	* mui: 完善hello mui选项卡示例，增加div模式、webview模式适用场景说明
	* mui: 解决内容区列表滚动后，popover不显示、仅显示遮罩的bug
	* mui: hello mui中选项卡增加数字角标示例
	* mui: 解决屏幕内容区触发Actionsheet，Actionsheet没固定在底部的bug
	* App: Android平台优化Webview窗口管理机制，降低内存使用峰值，提升在低端机上的窗口动画效率
	* App: 修复Android平台plus.runtime.install安装文件失败后可能导致异常的问题
	* App: 修复Android平台plus.io.resolveLocalFileSystemURL方法无法解析本地URL路径（file:开头）的问题
	* App: 修复Android平台多次创建AudioPlayer对象播放音频文件后可能导致播放失败的问题
	* App: 修复Android平台在某些情况下需要按两次返回键才触发backbutton事件的问题
	* App: iOS平台新增支持页面通顶显示（系统状态栏）功能,参见http://ask.dcloud.net.cn/article/118
	* App: 修复iOS平台相同zindex值的Webview窗口在隐藏后再显示可能导致相互覆盖混乱的问题
	* App打包: iOS平台支持64bit架构，兼容2015年2月1日起Appstore强制要求应用支持64bit架构
	* App打包: 修复iOS平台越狱包在iOS8.*设备上启动闪退的问题。
	* 语法库: 新增Android5.0的语法数据

----[4.7.2.201412090134]----

	* 紧急修复4.7.1版有可能因与手机助手等其他Android辅助工具冲突，造成的HBuilder无法连接Android手机的问题

----[4.7.1.201412042203]---

	* 优化了JS的转到定义 
	* 解决某些情况下JS文件的大纲不正确的问题 
	* 解决项目管理器中的图片文件预览遇到不能解析的图片时会报"no more handles"的问题 
	* 解决css格式化中=前后有空格时可能格式化失败的问题 
	* 优化iOS设备真机运行的兼容性 
	* 优化Android真机运行的兼容性，解决和部分手机助手冲突的问题 
	* 解决真机调试时控制台有时日志无法正确输出的问题 
	* 解决某些情况下启动失败的问题 
	* 添加生成JSDoc的快捷键Alt+Shift+J 
	* 解决某些情况下，工具-常规web浏览器设置列表会多出重复的浏览器设置的问题 
	* 解决mac上设置浏览器路径时，如果设置.app的路径时报不合法路径的问题 
	* 语法库: 新增部分html、css数据及js的浏览器兼容性数据 
	* App: 新增微信支持分享独立链接功能 
	* App: Android平台新增Webview窗口支持背景透明功能
	* App: 修复Android平台上传文件没有同步更新提交session的问题 
	* App: 修复Android平台按键事件传递逻辑混乱的问题 
	* App: 修复Android平台部分设备软键盘弹出后自动收回的问题
	* App: iOS平台新增动态修改系统状态栏样式API:plus.navigator.getStatusBarStyle
	* App: iOS平台新增侧滑返回（popGesture）事件
	* App: iOS平台更新支付宝插件SDK，修复在iPad设备上可能支付失败的问题
	* App: 修复iOS平台plus.nativeUI.prompt在iPhone6上显示输入框无法弹出软键盘的问题 
	* App: 修复iOS平台Webview窗口hide后再close可能导致屏幕闪动的问题 
	* App: 修复iOS平台在部分设备上第一次启动可能一直停留在Splash页面的问题 
	* App: 修复iOS平台从相册中选择图片后显示可能会旋转90°的问题 
	* App: 修复iOS平台发送短信可能会导致程序异常的问题 
	* App: 修复iOS平台Webview窗口在动画过程中关闭可能导致程序异常的问题 
	* mui: 完善侧滑菜单，增加遮罩蒙版、menu按键监听、back按键监听 
	* mui: 完善back按键监听逻辑，优先关闭popover、侧滑菜单，之后再关闭当前窗口 
	* mui: 增加card样式（圆角列表） 
	* mui: 解决Android 4.4版本手机在语音搜索框中无法弹出键盘的问题； 
	* mui: 增加创建遮罩蒙版API,参见http://dcloudio.github.io/mui/javascript/#mask
	* mui: 优化Android平台上拉加载体验 
	* mui: 增加左上角、右下角位置的popover弹出菜单 
	* mui: 修复选项卡和分段选择嵌套，导致显示区域错乱的bug
	* HelloH5+：Share页面添加微信分享独立链接消息示例
	* HelloH5+：Map页面添加显示背景透明Webview窗口示例（Android）
	* HelloH5+：Navigator页面添加修改系统状态栏样式的示例（iOS）
	
----[4.6.1.201411240154]----

	* App: 修复Android平台某些情况下Append webview无法捕获back按键事件的bug。关于多webview按键响应逻辑请参考http://ask.dcloud.net.cn/article/105 
	* mui: 解决hello mui首页连按两次back键无法退出App的问题
	* mui: 解决hello mui输入框示例中个别手机输入法无法弹出的问题
	* mui: hello mui首页增加侧滑导航示例
	* mui: 解决侧滑菜单在iOS平台不显示右侧导航箭头的问题
	* mui: 解决特定场景下拉刷新出现JS错误问题
	* mui: 支持iOS平台从屏幕左边缘推出关闭窗体，加强单手操作大屏iPhone的体验
	* mui: 解决Android 4.2.x版本，开关控件在滑动过程中圆角变方角的问题
	* mui: 解决Ajax传递中文参数乱码问题

----[4.6.0.201411180101]----

	* 双击选词，自动高亮相同字符（选多个相同词的快捷键仍是Ctrl+Shift+D） 
	* 优化js解析引擎,增强对复杂闭包参数传递等写法的兼容性 
	* js选择器中的ID也可以按ALT转到定义跳到HTML中ID的定义位置 
	* js的switch代码体中，在default或case前敲回车，自动生成一个新的case段 
	* JQuery、Zepto等框架js使用网络CDN引用时，也可以探测并自动挂载对应语法提示库 
	* 解决bootstrap3.3.1的css无法提示的问题
	* 优化当前行的复制粘贴（不选内容直接Ctrl+C、V） 
	* 修改CSS代码提示排序，-开头的前缀语法统一排在后面 
	* 边改边看的浏览器工具栏添加"显示网址二维码"和"打开控制台"功能 
	* 解决网络不稳定时安装、更新PHP插件无法启动或重启后不生效的问题 
	* 项目管理器右键菜单的"进入"点击后，可以只看当前的项目 
	* Ctrl+R快捷键在移动App中设为手机运行(web项目仍为打开浏览器) 
	* 大幅优化真机运行的兼容性，并提供真机运行常见故障排查指南 
	* 解决"打开目录"导入项目界面修改项目名称不起作用的问题 
	* 解决Ctrl+鼠标滚轮有时不能放大缩小字体的问题 
	* 解决安装"Ftp Sync"插件后"项目管理器"中"连接"的排序不在最后的问题 
	* 解决manifest界面配置iphone6的启动界面后打包不生效的问题 
	* 解决manifest界面配置支付宝等插件保存报错的问题 
	* 解决App打包上传过程中不能取消打包的问题 
	* App：去掉真机运行基座的开发模式水印图片 
	* App：iOS平台新增从屏幕左边侧滑可关闭Webview窗口功能（http://ask.dcloud.net.cn/article/102） 
	* App：iOS平台新增右侧推入动画（pop-in）效果 
	* App：修复iOS平台在某些情况下bounce属性失效的问题 
	* App：修复iOS平台在获取系统状态栏颜色值格式不对的问题 
	* App：修复百度定位模块没有获取方向、速度信息的问题 
	* App：修复Android平台父窗口hide后，子窗口再hide不触发事件的问题 
	* App：修复Android平台在setTimeout中监听下拉刷新事件无效的问题 
	* App：修复Android平台通过返回键关闭等待框后可能导致plus.nativeUI.closeWaiting方法无效的问题 
	* App：修复Android平台Webview的clear方法输出错误日志的问题 
	* App：修复Android平台Webview处理zindex属性可能导致窗口相互覆盖混乱的问题 
	* App：修复Android平台在IDE中真机运行时保存页面后可能无法同步刷新的问题 
	* App：支持Android打包自定义隐私权限Permissions（http://ask.dcloud.net.cn/article/101） 
	* HelloH5+：页面打开动画调整为推入动画（pop-in），iOS上支持侧滑返回效果 
	* mui: 优化窗体切换效果，动画更为流畅，通过复用webview降低了内存占用 
	* mui: iOS上支持左侧屏幕边缘侧滑关闭窗体 
	* 语法库： 增加chrome38的语法支持，如Symbol、BatteryManager等 
	* 语法库： 补充了一批语法数据及浏览器兼容性
	
----[4.5.0.201411031924]----

	* App配置文件mainfest.json新增iphone6（Plus）设置的配置选项
	* App配置文件mainfest.json的可视化视图新增分享、地图、支付等配置信息
	* 解决manifest.json代码视图中某些新增配置在真机运行时无效的问题
	* 解决用户手动安装了java8后，真机联调异常的问题
	* 解决项目中不包含中文名文件但真机运行时控制台误报有中文名字错误的问题
	* 解决Android真机联调基座有时候无法安装的问题
	* 解决真机联调时删除资源未同步至手机同时控制台报错的问题
	* 解决了未保存manifest文件直接打包可能导致图标不正确的问题
	* 调整项目管理器项目排序，已关闭项目排在末尾
	* 解决html文档中head、script、link等标签的id不提示的问题
	* 解决css格式化时会把伪类、伪元素前的空格去除导致css失效的问题
	* 解决有时格式化html中的css代码会多出空行的问题
	* 解决在css行尾输入敲空格激活代码助手后，执行结果与预期不符的问题
	* 解决有时在边改边看模式下切换html编辑器后，边改边看浏览器没有显示新页面的问题
	* 解决项目或文件名中包含多个连续特殊字符时，边改边看浏览器不能正确显示的问题
	* 优化重复插入行或选区功能（ctrl+shift+r）,智能处理换行
	* 解决js代码中有时强制Alt+/时插入代码位置不对的问题 
	* 解决在html的onclick等方法属性中写js时，光标有时会跑到html文档开头的问题
	* 颜色候选提示，新增了red、blue等英文候选
	* PHP: 解决卸载php插件后重新启动或使用全新的HBuilder启动,已打开的php文件报错的问题
	* PHP: 解决php编辑器debug时的断点颜色看不清的问题	
	* App：修复html页面存在id为plus节点时导致所有plus API无法使用的问题
	* App：修复Android平台plus.runtime.launchApplication调用第三方无法传递extra参数的问题
	* App：修复Android平台通过第三方应用启动时未更新plus.runtime.argments的问题
	* App：修复Android平台XHR对象的setRequestHeader方法设置content-type值无效的问题
	* App：修复Android平台在拍照界面连续点击返回键直接退出程序的问题
	* App：修复Android平台隐藏Webview页面后依然显示软键盘的问题
	* App：修复iOS平台在iPhone6（Plus）设备上的兼容性问题
	* App：修复iOS平台未安装快捷支付应用时取消支付可能导致应用崩溃的问题
	* App：修复iOS平台获取子Webview标题不正确的问题
	* App：修复iOS平台弹出日期、时间选择框会出现黑屏背景色的问题
	* App：修复iOS平台设置日期选择设置默认显示日期无效的问题
	* App：修复iOS平台调用发送邮件API无效的问题
	* App：更新iOS云端App平台打包支持iPhone6（Plus）设备
	* HelloH5+：修复在iOS8上div区域滚动的兼容性问题；
	* HelloH5+：优化分享页面，改进用户操作体验。
	* mui: 实现ajax功能封装，并提供示例；
	* mui: 修复android 4.2.1版本，switch控件圆角变方角的问题
	* mui: 修复android 4.4版本以下，左滑导航移动后顶部导航位置错乱的问题
	* mui: 解决iOS平台下拉刷新箭头切换卡顿的问题
	* mui: 优化popover关闭体验
	* 庆贺HTML5标准定稿！
	
----[4.4.0.201410192226]----

	* 解决HTML中的js方法不提示参数的问题，alt+shift+/为参数提示。 
	* 解决在不同作用域下给同一变量赋值，导致变量类型判断不准确的问题 
	* 优化js索引，解决部分卡顿的问题 
	* 移动App的manifest可视化视图中，修复友盟插件配置不正确的问题 
	* php插件：优化php提示，解决某些情况下含有namespace时不提示自定义方法的问题 
	* php插件：修改指定项目的php版本不生效的问题 
	* mui: 重构图片轮播插件实现，并将slideshowDelay参数简化为interval 
	* mui: 重构上拉、下载插件实现，支持上拉加载时没有更多数据的提示 
	* mui: 解决android4.4版本侧滑导航界面闪屏问题 
	* mui: 修复下拉刷新列表增加tap事件后，下拉过程中触发tap事件的bug 
	* mui: 解决hello mui中，快速点击下拉刷新界面，导致下拉区域无法关闭的bug 
	* mui: 使用subpage方式构建webview模式的选项卡界面 
	* mui: 增加preload方法实现预加载页面 
	* mui: 解决iOS平台输入法弹出后导致fixed定位元素位置错乱问题 
	* mui: 重构mui.init和mui.back方法 
	* mui: 优化清除按钮和语音按钮的点击体验 
	* mui: 修复popover遮罩的事件透传问题 
	* mui: 增加语音输入完成事件 
	* mui: hello mui增加二级折叠面板样式 
	* App: 更新个推SDK支持iOS8 
	* App: 新增实现支付宝快捷支付功能 
	* App: 新增Webview窗口动画支持透明度变化缩放效果 
	* App: 新增定义Webview窗口加载url错误页面 
	* App: 修复通过scheme调用应用时plus.runtime.arguments无法获取完整字符串的问题 
	* App: 修复Android平台二维码界面隐藏后无法再正常显示的问题 
	* App: 修复Android平台地图页面可能在某些情况下显示不正常的问题 
	* App: App云端打包修复iOS越狱包无法显示百度地图的问题 
	* App: App云端打包修复iPad(iOS7)设备启动界面可能抖动的问题 
	* App: HelloH5+模板新增支付功能演示页面

----[4.3.0.201410020207]----

	* 新增手动语法验证功能，在工具菜单和右键菜单中点验证本文档语法
	* 优化语法验证器设置，合并同类型的验证器，新增php语法验证器设置
	* 优化越用越卡的问题，处理某些js闭包写法造成的索引卡顿
	* App: 新增删除应用Cookie接口
	* App: 修复Android平台地图搜索API无法返回数据的问题
	* App: 修复Android平台启动界面无法自定义关闭显示雪花的问题
	* App: 修复Android平台在某些机器上无法从图库中选择图片的问题
	* App: 修复Android平台动态修改窗口大小后导致显示不正常的问题
	* App: 修复Android平台Webview作为子窗口时下拉刷新功能显示不正常的问题
	* App: 修复iOS平台在某些平台可能导致等待框无法关闭的问题
	* App: App云端打包新增支持应用自定义URL Scheme
	* mui: openWindow方法支持extras参数
	* mui: 支持跳转到图片轮播中的第index张图片
	* mui: 重构图片轮播插件实现，并将slideshowDelay参数简化为interval
	* mui: 重构上拉、下载插件实现，支持上拉加载时没有更多数据的提示
	* mui: 修复下拉刷新列表增加tap事件后，下拉过程中触发列表项tap事件的bug
	* mui: 增加preload方法实现预加载页面
	* 语法库: 补充andriod4.4上的语法兼容性数据
	* 祝大家国庆快乐

----[4.2.1.201409152016]----

	* App: 修复Android平台调用Geolocation API可能引起程序崩溃的问题
	* HelloH5应用修复iOS平台从系统相册选择图片无法正常显示的问题
	* HelloH5应用改进Android平台后台发送短信可自定义内容和选择收件人

----[4.2.0.201409132324]----

	* 解决边看边改模式下编辑没有被html引用的css文件会报错的问题 
	* 解决边看边改模式下编辑外部的html文件会报错的问题 
	* 解决边看边改修改页面引用的less或js没有刷新页面的问题
	* Mac：解决command+鼠标左键多光标编辑不能用的问题
	* Mac：解决command+鼠标滚轮放大缩小字体不能用的问题
	* App: 新增XMLHttpRequest对象对responseType属性的支持
	* App: 新增Geolocation通过百度地图模块进行定位
	* App: 新增Android平台对键按下、松开、长按事件的监听
	* App: 修复动态改变应用userAgent可能导致Plus API无法调用的问题
	* App: 修复Android平台退出应用后仍然保存Session数据的问题
	* App: 修复Android平台创建Webview窗口时设置zindex属性不生效的问题
	* App: 修复iOS平台查找联系人时multiple参数处理逻辑错误的问题
	* App: 修复iOS平台跨域请求时Cookie数据未保存的问题
	* App: 修复App云端打包可能导致百度地图后无法正常显示的问题
	* App: 修复App云端打包iOS越狱包覆盖安装更新后资源可能不更新的问题
	* mui: 增加新的图标文件
	* mui: 打开新窗口时，支持通过参数控制是否自动显示新页面
	* mui: 打开新窗口时，支持通过参数控制是否自动显示等待框
	* 语法库: 完善语法库：新增类DOMRectReadOnly等；移除openDialog的浏览器支持数据；新增Array属性及浏览器兼容数据；position新增新值域

----[4.1.0.201409052402]----

	* win: 修复dock到任务栏后无法启动的问题
	* win: 修复拖文件到HBuilder图标或关联文件后无法打开文件的问题
	* Mac: 完善启动器
	* Mac: 修改关于界面
	* Mac: 解决某些osx版本下无法打开文件选择框、无法选择字体的问题
	* 修改属性某些情况下无法使用转到定义功能的问题
	* 解决less文件中无法使用emmet的问题
	* 解决html中引用多个css时，边看边改css不会刷新浏览器内的问题
	* 解决项目或文件夹、文件名中包含#号时，使用边改边看或ctrl+r运行浏
	* 解决css格式化后会把"或'前的空格删除掉的问题
	* 解决某些情况下HBuilder闪退的问题
	* 解决欢迎向导界面快捷键失效的问题
	* 解决拖拽文件或文件夹到欢迎向导界面无效的问题
	* 重启HBuilder后保存配置状态，包括项目管理器文件同步、显示工具栏、显示行号、 高亮相同字符、自动换行
	* 解决内置Web服务器有时修改端口重启后还原的问题
	* 解决边看边改模式下，Ctrl+s后url后的参数丢失的问题
	* 语法库: 新增chrome37对dialog标签的支持、js新增HTMLDialogElement类、新增css属性all
	* App: 新增Webview对象的show和hide相关事件通知
    * App: 新增获取设备唯一标识接口plus.device.uuid
    * App: 修复联系人查找接口对过滤参数匹配不正确的问题
    * App: 修复Android平台toast默认不垂直居底对齐的问题
    * App: 修复Android平台二维码扫描设置过滤参数无效的问题
    * App: 新增iOS平台获取状态栏背景颜色的接口plus.navigator.getStatusBarBackground()
    * App: 修复iOS平台在iPad设备上弹出窗口默认不居中的问题
    * App: 打包机支持Android平台自定义是否开启硬件加速功能
    * MUI: 优化侧滑导航效果
    * MUI: 精简hello mui工程代码
    * MUI: mui框架不再监听App首页的Back按键，由App根据具体业务处理
    * MUI: 发布文档，地址是：http://dcloudio.github.io/mui/
    * MUI: Hello mui增加webview版选项卡示例
    * MUI: 解决openWindow方法中页面切换动画参数对预加载页面无效的问题
    * MUI: 页面关闭时，自动关闭该页面创建的所有页面
    * MUI：解决initGlobal方法设置页面切换动画无效的问题
    * MUI: 解决手动关闭预加载页面后，预加载页面无法再次打开的问题
	* 祝大家中秋快乐

----[4.0.0.201408241833]----

	* Mac版: 解决高分屏机器下，升级后界面显示错误的问题
	* Win版: 解决用户信息处点击退出无反应的问题
	* MUI: 增加preload事件，优化预加载时机
	* MUI: 优化侧滑导航动画及滑动速度
	* MUI: 优化开关毛边
	* MUI: 增加消息框（dialog）示例
	* MUI: 调整主界面控件列表顺序
	* App: 更新真机联调的iOS证书，已过期证书无法再安装到手机上
	* App: 修复通过parent方法获取的Webview对象无法访问扩展参数的问题
	* App: 修复Android平台使用video标签全屏播放视频可能导致背景显示错误或无法正常返回的问题
	* App: 修复Android平台在部分存在虚拟按键的机器上横竖屏切换显示不正常的问题
	* App: 修复Android平台通过XHR获取respnoseText中包含特殊字符（如单引号）处理不正确的问题
	* App: 修复Android平台访问某些https内容时可能无法正确显示的问题
	* App: 修复Android平台pickTime设置默认显示时间不生效的问题
	* App: 修复Android平台在某些手机上可能提示“打不开网页”的问题
	* App: 修复Android平台在某些手机上无法访问资源的问题
	* App: 修复iOS平台在7.x设备上启动时可能导致闪退的问题
	* App: 修复iOS平台在打开或关闭Webview对象可能会导致应用假死的问题

----[3.9.3.201408210214]----

	* 解决某些情况下Mac和Windows版本升级互干扰问题

----[3.9.2.201408192201]----

	* Win版 ：解决因jcef插件加载失败，导致HBuilder启动报错的问题
	* 解决PHP页面格式化混乱的问题
	* 解决新建项目时，偶尔报错的问题
	* 【已知问题】win版下，jcef.dll与谷歌输入法冲突，在某些情况下退出会报错

----[3.9.1.201408190131]----

	* MUI：解决Hello MUI在iPhone5上打开新窗口的卡顿问题
	* MUI：解决Hello MUI中滑块（range）样式丢失问题；
	* MUI：优化iOS平台窗口动画切换效果；
	* Mac版：解决Mac版仅打开一个页面时，文档没有被正确载入的问题
	* Mac版：登录器开放注册

----[3.9.0.201408172207]----

    * 【重要】开放本地打包。点菜单发行可见
    * 【重要】集成mui框架
    * 【重要】开放问答系统。点工具栏右上角的问答按钮，互动交流。
    * 【重要】改善格式化，集成jsbeauty插件
    * 【重要】升级边改边看的chromium版本，支持最新语法，支持右键打开内嵌浏览器控制台
    * 修复Android平台Webview窗口在横竖屏切换后可能导致无法显示的问题
    * 修复Android平台地图控件在横竖屏切换后可能导致显示不全的问题
    * 【重要】优化Android平台Webview窗体切换效果
    * 修复iOS平台在某些情况下会自动关闭启动界面的问题
    * 修复iOS平台使用个推推送消息可能导致重复接收的问题
    * 【重要】优化HelloH5+、CSDN应用的性能
    * 语法库新增Path2D、WeakSet对象，修正float等css值域范围


----[3.8.0.201408092124]----

	* 解决php编辑器下使用ctrl+r没有弹出设置外部服务器提示的问题
	* 修复Android平台在某些设备上使用select可能导致应用异常的问题；
	* 修复App云端打包生成appstore包提交后的缺少图片资源错误；
	* 修复App云端打包Android平台提交签名证书不生效的问题；
	* 新增webview对象支持自定义扩展参数功能；
	* 新增关闭所有等待窗口功能接口：plus.nativeUI.closeWaiting；
	* 新增管理应用cookie功能接口：plus.navigator.setCookie、plus.navigator.getCookie；
	* 新增管理应用userAgent功能接口：plus.navigator.setUserAgent、plus.navigator.getUserAgent；
	* Android平台新增阻塞网络图片加载控制接口：setBlockNetworkImage；
	* iOS平台新增应用切换到后台支持音乐播放功能。
	* 新增一批Math对象、Array对象、Number对象、Object对象的方法如：Math.clz32、Math.fround、Math.cosh;Array.fill;Number.MAX_SAFE_INTEGER、Number.MIN_SAFE_INTEGER;Object.setPrototypeOf等及其浏览器支持数据
	* 更换了一批视图的图标如边看边改的Web浏览器视图、快捷键视图等

----[3.7.1.201408052251]----

	* 修改打开编辑器自动打开快捷键视图的问题
	* 修改点击帮助菜单中的“快捷键大全”为打开快捷键视图
	* 修改新建移动App的Hello H5+模板打包参数错误的问题
	* 在编辑器右键菜单中增加版本管理

----[3.7.0.201408032050]----

	* 增加快捷键视图，使用ctrl+shift+L可以打开该视图
	* 修改真机调试启动、停止方式，点击真机调试手机列表中的选项即可启动，再次点击关闭真机调试。
	* 修复Webview窗口对象获取id属性可能不正确的问题
	* 新增Webview窗口对象隐藏（hide）及隐藏后再显示（show）支持动画效果
	* 新增Webview窗口对象动画显示完成的回调通知
	* 修复Android平台Webview窗口isVisible可能返回值不正确的问题
	* 修复Android平台新浪微博分享提示“No peer certificate”的问题
	* 修复iOS平台调用分享API可能导致应用异常的问题
	* 修复iOS平台多次调用地图后可能导致应用异常的问题
	* 修复iOS平台App云端生成的越狱包全屏显示的问题
	* 语法库补充a标签增加downlaod属性及浏览器支持数据
	* 在帮助菜单下增加吐槽和用户信息子菜单
	* 修改了FTP插件的汉化翻译

----[3.6.1.201407282132]----

	* 紧急修复Android的plus.runtime.openURL、plus.maps.openSysMap、Native.js创建桌面快捷方式的Bug
	* 修复font-family提示异常的问题

----[3.6.0.201407271554]----

	* 解决ctrl+shift+r选择文本包含某些特殊字符时会复制混乱的问题
	* 解决代码块视图查看详情对话框, 失去焦点后没有关闭的问题
	* 修改Ctrl+L快捷键为选中光标当前行，连续按下Ctrl+L会继续向下选中行。如需使用"转到行"功能，请使用Ctrl+G快捷键
	* 解决App打包状态查询不正确的问题
	* 修复plus.storage API无法正确读取带特殊字符（如'\'）的问题
	* 修复Android平台Webview无法移除dock样式子窗口的问题
	* 优化Android平台启动界面处理逻辑，避免启动时黑屏和窗口切换可能显示桌面的问题
	* 优化Android平台Webview窗口动画显示时可能导致闪屏的问题
	* 修复iOS云端打包的iPhone应用安装在iPad设备上显示默认启动界面的问题
	* 新增iOS平台控制状态栏样式及设置背景颜色功能
	* 新增iOS云端打包支持应用全屏显示模式功能

----[3.5.0.201407202225]----

	* 去除在</li>、</tr>等结束标签后输入回车自动生成li、tr标签的功能
	* 修改新建web项目界面，新增自定义web项目模板功能
	* 新增联网API请求与标准网络请求的Cookie数据同步功能
	* 修复Android平台地图中标点添加气泡无法显示的问题
	* 修复Android平台地图在某些情况下设置中心点坐标不生效的问题
	* 修复Android平台Waiting等待框的雪花图标可能不居中显示的问题
	* 修复Android平台横竖屏切换可能导致窗口位置和大小计算不正确的问题
	* 修复iOS平台在某些情况下会引起窗口滚动偏移量重置的问题
	* 修复iOS平台上传文件到某些服务器可能引起411错误的问题
	* HelloH5应用新增文件上传(Uploader)演示页面

----[3.4.1.201407131915]----

	* 紧急修复XmlHttpRequest请求总是返回失败的问题

----[3.4.0.201407121951]----

	* 防止升级包下载不全，增加MD5校验。下载不全可重新升级
    * manifest可视化界面补充了一批iOS的不同分辨率的图标
    * 工程下若有过多图片、视频、js、css文件，为提升加载速度，代码助手提示时会处理成分目录载入
    * 真机调试时修改css、js文件也会刷新手机上对应的页面，包括修改less、coffee等文件 
    * 修复首次使用HBuilder字体设置后不生效的问题
    * 修复Webview对象的id属性值总是为undefined的问题
    * 修复Webview对象的canForward方法回调函数的参数不正确的问题
    * 修复Webview对象的isVisible方法返回值为null的问题
    * 整理Android平台云端打包默认使用权限过多的问题
    * 修复Android平台在某些手机上从相册选择图片不能上传的问题
    * 修复Android平台plus.nativeUI.prompt弹出输入框中输入多行内容导致异常的问题
    * 修复Android平台分享图片不成功的问题
    * 修复Android平台接收个推透传消息逻辑处理中存在的问题
    * 修复Android平台横竖屏切换导致窗口位置计算错误的问题
    * 修复iOS平台从相册选择图片返回路径错误的问题
	
----[3.3.1.201407062235]----

	 * 解决manifest.json代码模式下添加了iOS的图标或启动图片后，打包不生效的问题
	 * 解决有些情况下视觉主题设置保存字体大小不生效的问题
	 * 新建文件添加模板，开发者也可以自定义自己的模板
	 * 去除新建移动App项目的Ratchet模板
	 * css属性、属性值使用代码助手补全后回车光标智能移动到分号(;)后
	 * HBuilder关闭adb.exe无法关闭的问题
	 * 解决某些情况下Android真机调试模式console日志输出有误的问题
	 * 修改新建移动App项目模板展现样式
	 * 解决Webview对象的hide方法未定义的问题
	 * 解决Android平台在某些情况下无法正常写入文件数据及拷贝文件无效的问题
	 * 解决Android平台上传任务未及时更新uploadedSize和totalSize值的问题
	 * 解决Android平台在某些情况下提示"Uncaught ReferenceError: SYNC_HANDLER is not defined"的问题
	 * 解决Android平台通过video标签播放视频无法全屏显示的问题
	 * 解决iOS平台Webview相互嵌套后窗口大小计算不准确的问题
	 * 解决iOS平台Webview无法独立开启垂直和水平方向的回弹效果
	 * 解决iOS平台Webview没有设置id值后导致部分API返回值不对的问题
	 * 解决iOS平台App打包可自定义设置应用内置版本号(CFBundleVersion)
	 * 修复iOS平台App打包修改部分配置后无法生成Appstore专用包的问题

----[3.2.2.201407020145]----

	* 解决新建App后使用真机调试会白屏的问题。

----[3.2.1.201406302101]----

	* 解决HBuilder升级后项目的JS框架语法提示有时不正常的问题，如JQurey的css方法变成大写
	* 解决真机调试时iOS基座包无法正确升级的问题，避免先手动删手机上的老包再调试的问题
	* 解决边看边改模式下多窗体多窗格不能正确识别当前文件，以至于保持时不会自动刷新的问题
	* 解决安装了PHP插件后，在某些情况下PHP文件仍然以Html编辑器打开的问题
	* 解决某些情况下打开搜索列表中的文件时，HBuilder崩溃的问题
	* 禁止svn插件弹出是否上报信息的提示框
	* 优化注释选中内容(Ctrl+Shift+/)
	* 拷贝JQuery、zepto文件时，自动挂载对应框架语法
	* 修复android某些情况下日志打印不全的问题。
	* 新增plus.webview对象，实现js操作原生webview，方便开发高性能HTML5应用
	* 调整窗口加载HTML页面机制为默认不可缩放，若设置可缩放可在API中通过参数赋值进行
	* 解决Android平台推送消息可能导致程序异常崩溃的问题
	* 解决Android平台分享API无法添加图片的问题
	* 解决Android平台调用第三方程序无法返回程序没有安装的错误信息
	* 解决Android选择时间对话框默认非24小时制的问题
	* 解决iOS在调用UI接口可能导致程序异常崩溃的问题
	* 语法库中补充了Firefox30的新增语法（升级语法库会触发重新构建JS索引）

----[3.1.0.201406222004]----

	* 菜单工具-插件安装界面，增加插件卸载链接
	* 优化真机联调控制台提示日志
	* 优化Ctrl+/注释及Ctrl+Shift+/多行注释
	* 解决复制或剪切折叠代码时，必须多复制一个换行符才可以正确复制或剪切折叠内容的问题
	* 解决Android平台调用pickTime返回的时间不正确的问题
	* 解决Android平台使用监听close事件的API后退出应用，会导致黑屏的问题
	* 解决Android平台从相册中选择图片后无法直接预览的问题
	* 解决Android2.3及以下设备上无法正常显示地图的问题
	* 解决Android平台分享总是提示失败及无法解除授权绑定的问题 
	* 解决Android平台创建过多下载任务后不能正常下载的问题
	* 解决Android平台在某些设备上横竖屏切换会导致程序崩溃的问题
	* 解决iOS平台调用API拷贝文件可能导致应用崩溃的问题
	* 解决iPad上弹出拍照界面没有默认居中的问题
	* 解决iOS平台在某些情况下不能触发close事件的问题

----[3.0.0.201406141908]----

	* 优化了构建索引时对CPU的占用，减少卡顿
	* 修复使用Ctrl+Shift+R复制当前行或选区时，如包含中文时会出现乱码的问题
	* 修复编辑css时，输入/*后排版错位的问题
	* 修复显示行号状态不正确的问题
	* 解决App中manifest.json图形配置界面中修改Android图标配置后切换到源码界面会还原的问题
    * 解决App中manifest.json手动添加的自定义属性提交打包时不生效的问题
    * 搜索条移至编辑器底部，并完善Ctrl+F策略:
        - 光标在代码区时，按Ctrl+F为显示/隐藏搜索条，若搜索条未显示，则显示，若搜索条已存在，则隐藏
        - 光标在代码区时，选中代码按Ctrl+F，把选中的文字自动放入搜索框，并将光标置焦到搜索条
        - 焦点在搜索条时，按Ctrl+F，查找定位到下一个匹配字符
        - 焦点在搜索条时，按Esc，隐藏搜索条
	* 查看App打包状态界面添加手动下载安装包的功能
	* App打包完成后，增加气泡提醒，点击气泡中的”安装包路径“链接，打开下载目录 
	* 新建移动App和新建Web项目时，增加默认新建项目的地址，如更换该地址，则下次新建默认地址更换为新的地址。
	* 美化了部分界面图标

----[2.9.1.201406082012]----

	* 紧急修复模糊提示有时不能正确补全代码的问题

----[2.9.0.201406071523]----
	
	* 真机联调增加"如何使用Chrome控制台调试Android应用"菜单
	* 修复联调时iPhone手机dll冲突导致无法连接的问题
    * 优化App的manifest.json编辑器，使其代码视图可以添加自定义json节点
    * 解决Android平台无法在多个窗口创建地图的问题
    * 解决Android平台播放音乐后导致应用退出时黑屏的问题
    * 解决Android平台下载API因无法识别文件名导致下载失败的问题
    * 优化iOS平台对一维码解码识别率
    * 修复打包App无法锁定屏幕方向的问题
	
	
----[2.8.0.201406021625]----

	* 优化打开文档时的速度
	* .cshtml格式的文件默认使用html编辑器打开，.ts格式的文件默认使用js编辑器打开
	* css中输入属性值回车后，自动补全分号，并智能移动光标位置
    * 提示css方法时敲回车，光标自动放到括号中
	* 完善部分汉化描述
	* 新增chrome35语法：新增类ShadowRoot;node对象新增方法createShadowRoot;css新增backface-visibility、transform、transform-origin、transform-style等
	* 修复新建移动App报客户端参数错误的bug
	* 解决使用代理后App打包下载失败的问题
	* App:解决new plus.net.XMLHttpRequestz在连接失败情况下获取statusText不正确；在返回数据为空情况下responseText无法访问的问题；
	* App:解决某些情况窗口关闭后未及时释放资源的问题；
	* App:解决android平台二维码扫描在部分设备上操作时可能导致异常退出的问题；
	* App:解决android平台在弹出软键盘时会覆盖输入框的问题；
	* App:解决android平台推送消息图标不正确，点击推送消息无法启动APP的问题；
	* App:解决在iPad上日期选择控件默认显示位置不正确的问题；	
	
----[2.7.1.201405272206]----

	* Android平台解决地图API无法触发click事件、标点对象显示不正常、气泡显示逻辑不正确的问题

----[2.7.0.201405260401]----

	* 解决某些情况下同一项目会同时触发多个构建的问题
	* 优化文档打开速度
	* 解决plus.ui.enumWindow()获取窗口对象不正确的问题
	* 解决plus.uploader无法正确上传文件的问题
	* 解决plus.io.FileWriter写入文件时，没有删除旧数据的问题
	* 解决plus.android.importClass无法导入操作蓝牙原生代码android.bluetooth.BluetoothAdapter 的问题
	* Android平台打包支持自定义添加系统权限（permission）
	* iOS平台打包支持自定义要引用的系统库（framework）
	
----[2.6.2.201405171907]----

	* plus.android.import()方法由于在某些低版本android手机报关键字冲突，该方法变更为plus.android.importClass()；原import()方法仍然可以使用，但是由于在某些2.x的系统上不生效，所以不推荐使用。已经使用Native.JS开发APP的开发者如果要兼容2.x系统，请修改该方法。
	* 修复PHP、JSP、ASP、ASPX文件中的JS方法、属性；CSS中已定义的颜色；HTML的ID等代码助手无法提示的问题
	* 解决夜间模式下标签卡字体看不清的问题
	* 修改搜索条“范围”选项文字描述，将"封闭项目"改为"当前项目"、"工作空间"改为"所有项目"

----[2.6.1.201405132054]----

	* 批量改词的功能补充快捷键Ctrl+Shift+A
	* 解决移动APP项目manifest.json的可视化视图中推送插件无法修改的问题
	* 解决Android打包应用无法调用Native.JS的问题

----[2.6.0.201405122310]----

    * 转到定义从Ctrl改为Alt+鼠标左键。快捷键Ctrl+Alt+D不变。本次修改统一了快捷键语法，Alt为"转到"，以及解放Ctrl为多光标输入让路
    * 新增批量改词的功能 ，比sublime的Ctrl+d更有优势的地方是可以使用Ctrl+鼠标去除一个不想选中的词。快捷键为Ctrl+Shift+D或Ctrl+鼠标左键
    * 重复插入当前行快捷键修改为Ctrl+Shift+R，打开文件快捷键变更为Ctrl+T；新增重复插入当前选区的功能
    * 优化启动速度,调整了部分插件、上次打开的文件的加载顺序。
    * 优化JS解析引擎，解决同一属性在不同作用域下赋值会解析错误的问题
    * 完善js语法提示，解决部分情况下this变量解析错误的问题
    * 完善js语法提示，优化命名空间形式和闭包形式创建的JS对象的处理
    * 新增Zepto框架语法提示库，对工程点右键"引入框架语法"来使用
    * 完善JQuery框架语法提示库，新增部分描述和示例
    * 暂时关闭文件重命名或移动时同步修改其他文件对本文件引用的功能
    * 移动APP：优化扩展API的执行效率
    * 移动APP：完善Native.JS
    * 移动APP：完善第三方分享插件（新浪微博、腾讯微博、微信）    
    * 新增Android真机调试控制台可以输出console日志的功能
    * 解决Android真机调试APP资源没有被正确替换的问题
    * 解决Android真机调试使用的终端安装包无法自动更新的问题
    * 语法库新增一批伪元素-webkit-media-controls-panel等
    * 语法库调整对firefox29的浏览器支持数据,新增部分语法如html的input属性值number、color，js的URLSearchParams、Gamepad、HTMLShadowElement；移除部分firefox29的浏览器不再支持的数据，如：js的属性CRMFObject、XULControllers、LoadStatus。详情参考https://developer.mozilla.org/en-US/Firefox/Releases/29

----[2.5.0.201404262022]----

    * 新增预编译器，可在保存文档时调用外部命令编译sass、coffee等文件。除了编译，还可实现压缩、混淆、提交ftp或git等多种功能
    * 修改PHP无法高亮相同字符的问题。
    * 优化Emmet和代码块的多光标输入
    * 修改某些情况下JS代码注释再取消注释,代码前会出现空格的问题
    * 解决启动后偶尔HBuilder会报JS源载入错误的问题
    * css新增伪类required等及浏览器兼容数据
    * 校正了js的queryselector、queryselectorAll等语法的浏览器兼容性
    
----[2.4.0.201404192403]----

    * 优化含有JQuery的项目的性能和体验，检测到JQuery相关文件时自动挂载扩展语法库
    * 优化因项目中文件太多导致的文件列表提示卡的问题
    * 优化语法树算法，降低js编写时CPU的占用
    * 解决代码助手在某些情况下会崩溃的问题
    * 解决修改html标签时触发代码助手后，使用数字选择对应提示，有时出现数字不消失的问题
    * 解决代码助手中提示的图片大小不正确的问题
    * 解决HBuilder启动时，由于打开过其他的eclipse、myeclipse等项目导致启动失败的问题
    * 新增一批css方法，如-webkit-linear-gradient()等
    * 优化不选择文字时复制剪切当前行的体验，自动处理行首行尾的空格、缩进
    * 优化外部web服务器的配置界面描述，补充示例
    * 推荐有礼，向好友推荐HBuilder，赢取cherry机械键盘，详见官方微博
	
----[2.3.0.201404131325]----

	* 框架语法提示支持自定义语法文件的导入了
	* 由于语法验证器插件影响性能，默认关闭了，如果需要，请在菜单工具- 语法验证器中打开
	* 修复在if、while等条件判断中，instanceof的 提示结果不正确的问题
	* CTRL+X可以剪切折叠代码了
	* 按下CTRL+X时如没有选中任何代码则默认为剪 切光标所在行 
	* 修复了部分代码块的错误，如css的height代码块缺少：号等
	* 移动APP：修复manifest.json代码视图切与可视化视图时，数据保存错误的问题
	* 移动APP：修复App打包失败时没有给出错误原因提示的问题
	* 语法库： 新 增chrome 34的新语法
	* 语法库： 更 正一批浏览器兼容数据的错误
	* 语法库： 补充了hsl、hsla、calc等CSS值域
	* 修复更新版本时偶尔会误报错误提示的问题

----[2.2.1.201404062147]----

	* 大幅优化JS提示速度
	* 完善智能补齐代码的撤销机制：
	   - 解决html中TR、TD、LI等回车自动补全后，使用CTRL+Z撤消不对的问题
	   - 解决输入'"[{(自动补全相应配对符号后,使用CTRL+Z撤消时,两个配对符号均被去除的问题
	   - 解决在触发代码助手后,想输入数字,却选中数字对应的值,现在通过CTRL+Z将选中的值直接还原为数字
	   - 解决在HTML中输入>完成标签编写时，自动将该标签的结束标签补全，现在通过CTRL+Z可去除结束标签
	* 增加FTP、SFTP、FTPS插件，在工具-插件安装中，安装FTP Sync插件即可
	* 解决CSS的backgourd、font等使用空格分隔的多个css属性值时提示不全的问题
	* 优化HTML标签显示外框,解决引用多个class值时或存在下划线时，与边框重叠显示的问题
	* less预编译不再在添加less文件时自动编译，仅在保存的时候自动编译
	* 解决用户自行导入其他主题时,重启后不保存的问题
	* 新增一批css属性值域：-moz-calc、calc等
	* 移动APP："查看App打包状态"界面, 添加每30秒自动刷新打包状态功能
	* 移动APP：添加App打包完成的消息通知
	* 移动APP：解决引入Push插件，打包完成后不生效的问题
	* 移动APP: 增加Ratchet模板,包含常用手机UI控件
	

----[2.1.1.201403311216]----

### [CHANGE]
	* 修改lesson，将回车符号修改为Enter，以免在某些情况下出现乱码
	* 修改JS DOC代码块,增加参数提示

----[2.1.0.201403302417]----

### [FIX]
	* 解决script标签如果type为text/javascript,但javascript不是全部小写时,js提示错误的问题
	* 解决在css属性值后面回车换行时,有时不会自动添加分号的问题
	* 解决less预编译有时会失败的问题
	* 解决启动时因索引失败导致无法提示的问题
	* 修正canvas.getContext第一个参数值域，由2D改为2d
	* 解决HTML中如果引用太多的js文件,提示会卡的问题
	* 解决部分参数不提示的问题
	* 移动APP：Android修复上传管理模块中存在的问题
	* 移动APP：修复在Android2.3及以下版本无法启动的问题
	* 移动APP：修复页面不支持<input type="file"></input>的问题
	* 解决某些情况下解析JS时发生死循环的问题
	* 优化了部分JS提示慢的问题
### [CHANGE]
	* 边看边改视图下关掉浏览器,自动切回到开发视图
	* 工具菜单中的"自定义代码块"菜单项变更为"扩展代码块"
	* 用户自定义的代码块与官方发布的代码块分离
    * 在HTML、CSS中定义ID、Class时，代码助手的数字选项默认带下划线，即通过ALT+相应数字可以选中对应的项
    * 绿柔配色方案中新增夜间模式
### [ADD]
	* 新增了还原配置的选项，在DIY HBuilder配置时，当配置出现问题或需要还原窗口布局时，可以在帮助菜单中点击还原配置还原HBuilder到初始状态。该操作不会影响代码。
	* 右键菜单里新增显示方法参数提示的菜单项，快捷键为 ALT+SHIFT+/(即ALT+?)


----[2.0.0.201403212345]----

### [FIX]
	* 解决启动会有很多ruby加载错误的问题
	* 解决使用"打开目录"导入的项目会丢失原有项目（如myeclipse项目）信息的问题
	* 解决在引入框架JS中去掉jquery时，仍然提示jquery的问题
	* 解决HBuilder在某些情况下崩溃的问题
	* 优化itunes dll调用方式，解决部分情况下因dll调用失败导致无法启动的问题
	* 解决div嵌套时，回车排版混乱的问题
	* 解决某些情况下不触发代码助手的问题
	* 解决部分jqueryAPI的值域不提示的问题
### [CHANGE]
	* 修改部分内容的中文翻译
	* css在代码助手中选择提示的代码后，不再直接替换当前的整个元素、属性、属性值
	* 跳转菜单添加"快速跳转选项卡"项
	* 完善在进行移动App打包时，Android打包的App包名校验规则
	* 将帮助菜单的eclipse帮助及搜索合并至eclipse帮助
	* 修改查找为搜索条，将高级搜索修改为搜索框，去掉重复功能查找/替换
### [ADD]
	* 开放了jquery的语法库定义文件，托管在https://github.com/dcloudio/WebFrameworkGrammar，欢迎大家修改、更新
	* 帮助菜单新增“在线帮助”
	* 支持离线安装插件，用户可以将eclipse3.x的插件放置在HBuilder安装目录下的dropins，HBuilder即会加载该插件（解压到相应目录后，HBuilder需重启两次）


----[1.9.0.201403170114]----

### [FIX]
	* 紧急修复因JQUERY构建引起的软件崩溃
	* 移动APP：iOS平台修复基座在iPhone5s及iPad上的图标错误；
	* 移动APP：iOS平台修复Push API中无法创建本地消息的bug;
### [ADD]
	* 构建器增加JQUERY1.8的构建
	* 工具和项目的右键菜单增加引入框架语法提示的子项，在引入框架语法提示中可以选择JQUERY的解析版本
	* 移动APP：iOS平台增加距离感应器API（plus.proximity）
	* 移动APP：iOS平台增加文件系统中绝对路径和相对路径的转换API
	* 移动APP：iOS平台增加直接调用原生系统API（plus.ios）


----[1.8.0.201403151832]----

### [FIX]
	* 解决移动App云端打包失败时, 弹出错误信息提示不正确的问题
	* 解决安装php插件重启后，某些情况下,启动时自动打开的php文件没有使用php编辑器的问题
	* 解决css在编辑注释代码会出现代码提示的问题
	* 解决安装php插件后，拖入文件到HBuilder直接编辑报错的问题
	* 解决在非移动App应用中,manifest.json文件打开异常的问题
	* 解决修改高亮和显示空白字符在toolbar和菜单或快捷键操作时状态不同步的问题
	* 解决部分js方法属性ie兼容性不对的问题，如setAttribute、getAttribute等
	* 解决在php编辑器点击右键多出"公开宣布"菜单的问题
	* 解决移动App打的包会重复下载的问题
	* 语法库：解决canvas.arc等方法的参数顺序不对的问题
	* 移动APP：解决创建多个XMLHttpRequest请求后无法正确获取数据的问题
### [CHANGE]
	* 修改部分原Eclipse英文描述为中文
	* 完善后台升级功能，升级进度可视化，升级后提示更准确
	* 增加Emmet默认支持的文件类型
	* 修改自动换行的逻辑，视图菜单里的自动换行对所有文档生效，右键菜单中的自动换行仅对本文档生效
	* 修改显示高亮字符、显示空白字符、显示行号，这些操作将对所有文档生效
### [ADD]
	* 添加了在菜单-文件里增加以“其他编码方式打开”的菜单
	* 增加自定义代码块菜单，在工具->自定义代码块菜单中可选择编辑HTML、js、css、xml、php、jq代码块
	* 代码助手的详细信息中，添加代码块触发字符、来源信息、详细信息标题 
	* 移动APP：添加文件系统中绝对路径和相对路径的转换API
	* 移动APP：添加系统事件：“pause”、“resume”、“netchange”、“newintent”


----[1.7.0.201403100201]----

### [CHANGE] 
	 * 优化JS解析引擎，对暂时无法解析的或解析不准确的参数、对象等增加模糊提示列表，在模糊提示列表中以斜体提示可能正确的方法或属性
	 * 修改egit插件的配色方案
	 * 补充一批使用教程到Tips,在帮助->编辑Tips中查看
### [ADD] 
	 * 增加JS方法参数的字符串值域提示


----[1.6.0.201403060132]----

### [CHANGE]
	 * APP打包时，提交云端时的进度界面现在可以后台运行了
### [ADD] 
	 * JS语法库更新，完善AudioBuffer等类型的方法及浏览器兼容数据
### [FIX]
	 * 修复因语法库升级造成的lesson1.txt提示数字错误的问题。请老用户删除原有Hello HBuilder项目，在新建web项目处重新选择Hello HBuilder模板


----[1.5.0.201402211858]----

### [CHANGE]
     * 没有安装AptanaPhp插件时,打开Php文件默认使用HTML编辑器。安装AptanaPhp插件后打开Php文件使用Php编辑器
### [ADD]
     * 打开可能含有HTML代码的文件如ASP、PHP、JSP等时，默认使用HTML编辑器打开，但在写PHP、ASP、JSP代码时不提示html的代码助手。
     * 完善部分JS对象如IDBRequest等的解析及浏览器兼容数据
### [FIX]
   	 * 解决在别的机器修改密码后，打开HBuilder新建移动项目无法成功的问题


----[1.4.0.201402182325]----

### [ADD]
     * CSS：支持没有任何限定的CSS选择器 如 [.在此位置输入.]{}  
     * CSS：可精确提示ID限定的CSS选择属性 如 #id1[.在此位置输入.]{}
     * JS：新增 document.querySelectorAll() 结果类型可精确提示 如 document.querySelectorAll("#div1")[0].dataset = foo...
     * JS：增强对一些设备相关JS对象的支持如 navigator.battery DOMCursor SVGAElement IDBFacotry等，使得语法提示更为精确
     * CSS：新增一些属性的支持 grid-template、touch-action、-webkit-flex、-webkit-border-bottom-left-radius、-webkit-text-decoration、-webkit-border-top-left-radius、shape-padding、-webkit-binding等
     * CSS: 增加一些属性值域：bottom、right、lr、chained、inherit、match-parent、-webkit-crisp-edges等
     * Canvas: 改善对WebGL的支持 如 gl = document.getElementById("canvas1").getContext('webgl',{ antialias: false,stencil: true })，第二个参数能自动提示
### [CHANGE]
     * 代码助手：修改在HTML的空白区域输入不再激活代码助手，更快捷
     * 编辑器：选中的配对符号的一侧如‘“[{(修改，另一侧自动匹配修改
     * 菜单：修改文件菜单的打开方式项，增加所有现在已支持的文件编辑器
### [FIX]
     * 移动开发：增加移动App项目Android打包App包名格式校验
     * 编辑器：修改提示锚点时，先输#然后选择，结果重复#的问题
     * 编辑器：修改空行有缩进的情况下使用ctrl+/注释时，出现了多个注释块的问题


----[1.3.0.201401231922]----

###[FIX]
	* 解决更换了新UI后，如果使用黑色主题的界面，选项卡会变黑的问题


----[1.3.0.201401230310]----

###[FIX]
	* 解决项目构建器信息不正确的项目不能正确自动预编译的问题
###[CHANGE]	
	* 自动预编译修改为仅在修改文件保存时进行编译
	* 修改自动预编译失败时提示信息的格式
	* 补充了一批chrome32的 新语法


----[1.2.0.201401211204]----

###[FIX]
	* 解决因某些补丁更新失败，导致新建移动应用失败的问题
	* 解决在某些情况下HBuilder莫名被置前的问题
	* 增加下载时断点续传，解决app打包状态查看有时显示"由于网络原因,下载失败"的问题
	* 解决app打包时，某些情况下会出现下载的安装包数据不全的问题	
###[CHANGE]
	* 补充了一批chrome32的 新语法


----[1.2.0.201401182349]----

###[FIX]
	* 解决在边看边改模式下,从外部拖拽文件进 HBuilder,浏览器不响应的问题
	* 解决在导航树双击不展开文件夹的问题，同时增加回车响应事件
	* 解决在HTML文件中按下h键后，再选择数字会出现IE6注释的问题
	* 解决如果代码助手第一位是数字的情况下，也必须用Alt+数字进行选择的问题
###[CHANGE]
	* js引擎优化对数组和DOM函数的解析
	* 美化了界面
###[ADD]
	* 代码块可以自己编辑了，在代码块提示栏右下角点编辑图标


----[1.1.0.201401151750]----

###[FIX]
	* 解决试用HBuilder关联某些文件后，双击该文件HBuilder打不开的问题
###[CHANGE]
	* 完善了语法库


----[1.1.0.201401102048]----

###[FIX]
	* 解决代码助手在某些情况下会出现多余字符的问题
	* 解决有些情况下代码助手不激活的问题
	* 解决重构时如果重构内容包含未保存文件时，不提示保存的问题
###[CHANGE]
	* 完善了语法库


----[1.0.0.201401091853]----

###[FIX]
	* 解决打开工具→选项有时弹出错误提示的问题
	* 解决使用css属性选择器时，若属性值包含在双引号中时，无法正确提示的问题
	* 解决因启动器与主程序之间调用冲突问题无法启动的问题
	* 解决从外部拖拽文件进 HBuilder，边看边改模式浏览器无响应的问题
	* 解决在边看边改模式下，新建菜单与task任务栏不显示的问题
###[ADD]
	* 添加ruby、less、sass、coffeescript、yml、haml、markdown文件的着色
	* 增加了代码助手如含有数字时，可使用alt+数字键选择
	* 常用插件安装增加ftp与markdown
###[CHANGE]
	* 修改 边看边改模式 中浏览器的分辨率，适配当前主流分辨率
	* 修改部分国际化
	* 文件编码添加GBK、GB2312。在项目管理器中，右键点击项目或需要改变编码的文件，在属性中可修改文件打开、编辑、保存时使用的编码
	* 完善了语法库


----[1.0.0.201401012223]----

###[FIX] 
	* 修复css部分值域不提示的问题
	* 修复php文件中，浏览器兼容提示缺失的问题
	* 修复js中css对象属性的部分值域不提示的问题
###[CHANGE]
	* 第一次启动默认加入HelloHBuilder项目
	* 编辑器右键菜单去除"显示位置"并添加"打开文件所在目录"
	* 优化了启动速度


----[0.5.4.201312271808]----

###[FIX] 
	* 优化安装PHP插件流程，在未选择是否安装PHP插件前，PHP文件将不会新建
	* 解决某些css着色错误的问题
	* 解决css RGB颜色及属性选择器中属性值有时着色不正确的问题
	* 优化文件索引创建流程，打开文件时将不创建文件索引
	* 修复浏览器运行，现在可以预览非项目下html文件
	* 优化大文档解析速度和提示速度


----[0.5.4.201312202051]----

###[ADD]
	* 在右键菜单新增创建php功能
	* 增加常用插件配置，请在工具->插件安装
###[CHANGE]
	* 在编辑器内进行copy操作时, 如当前没有选择文字, 则复制当前行
	* 修改边改边看
		-打开方式变更，由原来的直接打开硬盘文件修改为打开部署于HBuilder内部服务器的URL地址。
        -关闭所有HTML文件时，清空原来打开的界面。
		-当修改与当前浏览的HTML无关的css文件时，浏览器将不再刷新。


----[0.5.4.201312132308]----

###[FIX] 
	* 解决编辑css文件时，光标在两个;中间的属性名提示不准确的问题
	* 解决编辑css文件时id或class连写的情况下，使用代码助手补全代码不正确的问题
	* 解决代码助手在css文件中紧靠分号的情况下，有时提示不正确的问题
	* 优化构建器，使项目在构建时可以保存文件及删除项目
	* 解决修改验证器设置后会重新构建索引的问题
	* 解决在js文件中对<!-- -->的解析报错的问题
	* 解决JS对出现某些特殊字符时无法解析的问题
	* 修复创建默认的移动应用因权限缺失无法进行真机联调的问题
###[ADD]
	* 在工具菜单及编辑器左侧添加"验证器设置"按钮
	* 增加 实时预览透视图，编辑html、 css保存,可在该视图实时预览效果
	* 常用插件一键安装。点击工具->常用插件安装可安装svn、git、js压缩插件
	* 优化JS解析，使JS在出现无法解析的情况时，仍然可以进行代码提示
	* 添加模糊查询默认按照分类优先显示以输入的字符开头的，然后在按照分类显示模糊查询的内容
###[CHANGE]
	* 修改部分国际化
	* 修改html中输入标签和属性时，去掉tab键切换点
	* 修改div等相关代码块，使之更符合用户用法
	* 修改代码助手在上下移动时如果在第一条或最后一条进行相应的翻页操作
	* 修改拖动一个目录到HBuilder操作，改为拖动后直接打开


----[0.5.4.201311291943]----

###[FIX]
	 *修改部分文档作色错误的bug
###[CHANGE]
	 *完善语法库


----[0.5.4.201311281925]----

###[CHANGE]
     *HTML、CSS属性及值域的浏览器兼容性提示更加准确。
     *完善语法库


----[0.5.4.201311272312]----

###[FIX]
     * 解决项目管理器中与打开的文件同步的选项，每次开启时都自动选中的问题
	 * 解决css提示expression()表达式错误的问题
	 * 解决css属性值的浏览器兼容显示的是属性的浏览器兼容问题   
###[CHANGE]
     * 修改JavaScript引擎解析不同作用域下变量引用解析方式不正确的问题  
###[ADD]
     * 在</option>、</td>、</li>、</dd>、video的</source>、object的</param>节点后输入回车，则自动为其添加一行默认的代码
     * 增加一个dl的代码块，格式为
	     <dl>
			<dt></dt>
			<dd></dd>
		 </dl>		         


----[0.5.4.201311230455]----

###[FIX]
     1.解决css属性选择器中错误提示元素, 没有提示元素对应属性及属性值的问题
     2.解决win8下拖动workspace下的文件时会提示对话框的问题
     3.解决全部关闭编辑器时，再次打开编辑器时出现空白的问题         
###[CHANGE]
     * 更新编辑器左侧任务及书签的图标
     * 修改部分国际化
     * 优化拖动文件时如果发现拖动的时.project文件执行导入项目操作
     * 优化拖动文件时，当发现目录中存在.project文件时，提示用户执行导入项目操作
     * 修改浏览器兼容性在索引中不存在时不显示
     * 修改首选项设置主题时同步修改视觉主题设置的界面
     * 优化启动速度      
     * 优化jquery支持，并加入写$（""）时可以写css selector的功能  
###[ADD]
     * 添加启动代理设置功能
     * 添加启动初始化升级代理设置
     * 增加代理支持，用户可以使用代理正常登录、使用HBuilder


----[0.5.4.201311160348]----

###[FIX]
     * 解决css在import后追加media_query_list会报错误的问题
     * 解决css不兼容keyframe的animationname不能使用引号包围的问题
     * 解决启动后工具栏上的放大缩小字体按钮禁用的问题
     * 解决运行会等待build结束才进行的问题
     * 解决工具栏上的列选择、高亮和显示空白字符的显示状态与实际不符的问题
     * 视图菜单： 新建窗口， 欢迎向导也没有出现。
     * 解决html中事件函数追踪时，出现多个语句时不正确的问题
     * 解决js中url的追踪问题
     * 修复新建移动应用时appid没有修改的问题
     * 修改在div标签内输入<div时无法选中的问题。
     * 修改script、a、link等代码块选中时自动拉出相关的内容
###[CHANGE]
     * 升级后不再提示是否立即应用,只提示是否立即重启
     * 默认添加eclipse indigo及hbuilder plugin的升级地址
     * php代码助手及outline图标更新
     * 导入CodeDir下已存在的项目,并删除CodeDir下的多余metadata目录
     * "视图"菜单下的"新建窗口"改名为"新建HBuilder窗体"
     * 片断视图改名为代码块视图
     * 运行前提示所有未保存文件保存修改为只提示当前项目的未保存文件保存
     * 将欢迎向导集成到了编辑器中间空白的区域
	 * 将欢迎向导拦截的快捷键发布出来一部分，主要是Ctrl、Shift、Alt组合的快捷键。
	 * JS typeof值域
	 * 加入switch case的解析
	 * 修改了部分配置文件编辑器界面
	 * 优化代码助手，略微提升执行效率
	 * 当提示的内容中有可能是数字时，去掉数字选择提示内容       
###[ADD]
     * 添加android App云端打包功能
     * 添加没有php插件时打开php文件提示安装php插件的功能
     * 添加更改代码存放目录
     * 修改select代码块，只含有一个option标签，回车时自动添加option标签
     * 加入debugger关键字

###[已知问题]
     * 终端界面输出中文时界面排列不正确
     * html代码提示在紧靠</style>或</script>的左侧时不会提示对应css或js代码块
     * php在添加以IE浏览器运行调试时，连接xdebug有时会卡住


----[0.5.4.201311062356]----

###[FIX]
     * 解决JS内置对象、方法在js文件中被覆盖时, 使用此对象、方法的HTML文件会报没引入对应js文件的问题
     * 解决html文件引入了网络地址的js,仍会报js文件未引入的问题
     * 解决html文件的js引入校验编辑后保存有时校验结果不正确的问题
     * 解决css格式校验不能正确识别一些hack的问题
     * 解决html文件的js引入校验会报catch节点中的异常变量未引入对应js文件的问题
     * 解决菜单中的"上一个/下一个滚动条标记点"无法跳转到任务和书签上的问题
     * 解决浏览器内运行html使用firefox有时没有打开对应网页的问题
  	 * 解决 在左边已经有项目的情况下，如果上次只打开过欢迎向导，下次启动是右边就变光秃秃灰溜溜了，不会再自动打开欢迎向导。
  	 * 解决 新建移动App时，不检查目录同名的问题了.
  	 * 解决代码助手偶尔出现在右边很远的位置的问题
  	 * 解决加包围时，从代码助手选择标签出现有多余的闭合标签的问题
  	 * 解决在HTML区域输入空格后立即按小键盘的+号，结果出来的是= 的问题
  	 * 解决data- 代码块在闭合标签上也提示的问题
  	 * 解决html中输入&无法选择代码助手中的提示的问题         
###[CHANGE]
     * 修改部分国际化
     * 项目管理界面与编辑器界面的链接修改为默认启用
     * 更新浏览器运行的IETester的图标
     * 调整右键菜单顺序
     * JS函数提示补全带（），并自动激活参数提示
     * 重新定义移动应用目录结构
     * 用户配置信息与代码存放目录分离
     * 修改link、script代码块
     * 修改ctrl+/兼容选择代码注释功能
     * 修改选中补全‘“ < [ { ( 符号时，选中的字符仍然处于选中状态 
     * 修改在HTML中引用class时，优先提示HTML引用的css文件中的class 
     * 修改使代码助手右下角的蓝色问题适时出现        
###[ADD]
     * 浏览器运行添加对IETester的默认支持
     * 针对在不同PC上的显示器亮度及灰阶程度，新增两套绿柔主题，并自动给开发者推荐健康环保的主题。
###[已知问题]
     * 终端界面输出中文时界面排列不正确
     * html代码提示在紧靠</style>或</script>的左侧时不会提示对应css或js代码块         


----[0.5.4.201310211156]----

###[FIX]
     * 解决浏览器器内运行html，有时找不到当前文件的问题
     * 解决有时无法启动nginx之类的外部Web Server服务器的问题
     * 解决ico文件在工程目录下显示的图标是空白的问题
     * 解决css中url()链接跳转，有时跳转的地址不正确的问题
     * 解决css在属性值里使用Rgba()等方法时，在方法参数区域内出现属性值的代码提示的问题
     * 解决IDE界面布局重置时会在IDE右侧出现一个空白框的问题
     * 修改代码助手和代码提示信息示例内容显示不全的问题
	 * 修改a标签href属性输入#号时不自动提示锚点的问题
	 * 修改html中添加包围时，如果选中的内容中包含js，并且js内容中含有{}时，会在末尾加上}号的问题
	 * 修改加包围时多加了闭合标签的问题
	 * 修改data-代码块在闭合标签提示的问题
	 * 解决因JS中子类和父类的一样造成的死循环问题
	 * 解决欢迎向导多次打开的问题
	 * 修复某些情况下无法获取当前项目的问题
###[CHANGE]
     * 补全部分国际化
     * 补全部分菜单的&快捷键
     * 去除了集成的GIT及相关的终端视图
     * 去除了安装bundle的菜单
	 * 修改了浏览器运行的浏览器配置界面
	 * 修改代码助手在不同的主题配色下显示一致
	 * 去掉代码助手和代码提示信息的示例中的超链接
	 * 修改link代码块输入后默认光标应该在href里，并且不需要title属性
	 * 修改手动选中一行文字，按 ‘ “ < [ { ( 这6个字符，自动在选中文字左右加上对应包围符号，并选中的字符仍然处于选中状态。
	 * HTML中引用class时，优先提示HTML引用的css文件中的class
	 * 修改代码助手右下角的蓝色问号在没有意义的时候不出现
	 * 优化JS返回值以及多层返回值的解析
     * 优化JS闭包的解析
	 * 优化JSthis的解析
	 * 真机联调时更改取消按钮的位置以及优化了文字显示的布局
	 * 修改真机联调时手机连接时的提示信息位置为状态信息栏		 
###[ADD]
	 * 代码助手二次提示时不重新绘制界面，直接用原来的界面
	 * html中修改属性时，选中原来的value值，并自动提示新的value值域，选中替换原来的值
	 * 添加jquery百度CDN代码块

