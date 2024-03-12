package com.panasonic.sanyo.ts.firmwareupdate;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class FirmwareUpdateActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    finishAndRemoveTask();
    Toast.makeText(this, "ファームウェアアップデートはサポートされていません｡", Toast.LENGTH_SHORT).show();
  }

}
