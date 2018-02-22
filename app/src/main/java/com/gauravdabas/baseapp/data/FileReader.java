package com.gauravdabas.baseapp.data;

import android.content.Context;
import android.os.Environment;
import com.gauravdabas.baseapp.common.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileReader {

    public String readAsJSON(Context context, String fileName) {
        String filePath = Constants.CONFIG_PATH_PREFIX + fileName;
        if (fileExistsOnSdCard(filePath)) {
            return readJsonFileAtPath(Environment.getExternalStorageDirectory() + filePath);
        } else {
            return readJsonFileFromAsset(context, fileName);
        }
    }

    private String readJsonFileAtPath(String filePath) {
        String json;
        try {
            @SuppressWarnings("IOResourceOpenedButNotSafelyClosed")
            InputStream is = new FileInputStream(filePath);
            int size = is.available();
            byte[] buffer = new byte[size];

            //noinspection ResultOfMethodCallIgnored
            is.read(buffer);
            is.close();

            //noinspection HardCodedStringLiteral
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    private String readJsonFileFromAsset(Context context, String fileName) {
        String json;
        try {
            InputStream is = context.getAssets().open(fileName);
            int size = is.available();
            byte[] buffer = new byte[size];

            //noinspection ResultOfMethodCallIgnored
            is.read(buffer);
            is.close();

            //noinspection HardCodedStringLiteral
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    private boolean fileExistsOnSdCard(String filePath) {
        File file = new File(Environment.getExternalStorageDirectory() + filePath);
        return file.exists();
    }
}
