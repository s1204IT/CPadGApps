package com.android.settings.launcher;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;

public class GmsCore extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    try {
      startActivity(new Intent(Intent.ACTION_MAIN).setClassName("com.google.android.gms", "com.google.android.gms.app.settings.GoogleSettingsActivity"));
    } catch (ActivityNotFoundException ignored) {
    }
    finishAndRemoveTask();
  }

}
