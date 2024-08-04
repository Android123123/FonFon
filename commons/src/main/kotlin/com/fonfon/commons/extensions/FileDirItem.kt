package com.fonfon.commons.extensions

import android.content.Context
import com.fonfon.commons.models.FileDirItem

fun FileDirItem.isRecycleBinPath(context: Context): Boolean {
    return path.startsWith(context.recycleBinPath)
}
