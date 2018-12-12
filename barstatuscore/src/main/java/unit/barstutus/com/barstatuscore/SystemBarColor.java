package unit.barstutus.com.barstatuscore;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;

import unit.barstutus.com.barstatuscore.utils.SystemBarTintManager;

/**
 * 项目名称：BarStutusProject
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2018/12/12 9:31
 * 修改备注
 */
public class SystemBarColor {

    public static void parseColor(Activity activity, int color){
        //设置 trans 为true
        if(Build.VERSION.SDK_INT>Build.VERSION_CODES.KITKAT){
            setTranslucentStatus(activity,true);
            SystemBarTintManager systemBarTintManager=new SystemBarTintManager(activity);
            systemBarTintManager.setStatusBarTintEnabled(true);
            systemBarTintManager.setStatusBarTintColor(color);
        }
    }

    @TargetApi(19)
    private static void setTranslucentStatus(Activity activity, boolean on) {
        Window win = activity.getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }
}
