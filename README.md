# Toast Library

[![](https://jitpack.io/v/aleee-ahmed96/PracticeLibrary.svg)](https://jitpack.io/#aleee-ahmed96/PracticeLibrary)


Show Toast easily, anywhere.


in your build.gradle(project)


	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
  in your build.gradle(app)

	 dependencies {
		implementation 'com.github.aleee-ahmed96:PracticeLibrary:0.3.0'
	 }


How To Use: 

To show Toast in your app. 

	Toasty.show(context, "your message")
