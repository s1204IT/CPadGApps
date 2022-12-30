package com.panasonic.sanyo.ts.firmwareupdate;

import android.app.Activity;
import android.os.Bundle;

public class FirmwareUpdateActivity extends Activity {
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    super.onDestroy();
    finish();
  }
}
