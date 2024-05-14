package jp.co.benesse.dcha.setupwizard;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

public class StartWidget extends AppWidgetProvider {
  public void onUpdate (Context c, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
    RemoteViews remoteViews = new RemoteViews(c.getPackageName(), R.layout.widget);
    Intent p = new Intent(Intent.ACTION_MAIN);
    p.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    p.setClassName("com.android.vending", "com.android.vending.AssetBrowserActivity");
    remoteViews.setOnClickPendingIntent(R.id.widget_btn, PendingIntent.getActivity(c, 0, p, 0));
    appWidgetManager.updateAppWidget(appWidgetIds, remoteViews);
  }
}
