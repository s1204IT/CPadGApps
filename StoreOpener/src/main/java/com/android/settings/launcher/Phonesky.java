package com.android.settings.launcher;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;

public class Phonesky extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    try {
      startActivity(new Intent(Intent.ACTION_MAIN).setClassName("com.android.vending", "com.android.vending.AssetBrowserActivity"));
    } catch (ActivityNotFoundException ignored) {
    }
    finishAndRemoveTask();
  }

}
