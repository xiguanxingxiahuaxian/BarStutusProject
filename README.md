
##代码说明
用户沉浸式状态栏

##代码调用
SystemBarColor.parseColor(this,R.color.colorPrimaryDark);

##集成方式
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.xiguanxingxiahuaxian:BarStutusProject:Tag'
	}

