package projectframework.example.admin.projectframework.permission;

import java.util.List;

/**
 * Created by USER on 2017/7/7.
 */

public interface PermissionListener {
    /**
     * 成功获取权限
     */
    void onGranted();

    /**
     * 为获取权限
     */
    void onDenied(List<String> deniedPermission);
}
