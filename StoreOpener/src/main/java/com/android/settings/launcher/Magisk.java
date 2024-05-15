package com.android.settings.launcher;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;

public class Magisk extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    try {
      startActivity(new Intent(Intent.ACTION_MAIN).setClassName("com.topjohnwu.magisk", "com.topjohnwu.magisk.ui.MainActivity"));
    } catch (ActivityNotFoundException ignored) {
    }
    finishAndRemoveTask();
  }

}
