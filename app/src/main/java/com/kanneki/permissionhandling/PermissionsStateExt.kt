package com.kanneki.permissionhandling

import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.PermissionState

@ExperimentalPermissionsApi
fun PermissionState.isPermanentLyDenied(): Boolean {
    return !shouldShowRationale && !hasPermission
}