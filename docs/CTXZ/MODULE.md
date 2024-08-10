# CPadGApps for CTX/CTZ
Googleサービスの追加やDcha系の削除､ PiPの機能追加が含まれています。<br>

<details><summary><b>詳細</b></summary><br>

モジュールID：**CPadGApps-CTXZ**

バージョン：v1.1.0
</details>

<details><summary><b>追加</b></summary><br>

## 機能

- **android.software.picture_in_picture**

その他 Google のやつ (需要が分からん)

一応、**GMS**依存のシステムアップデート機能を無効化するコードを実行しますが、アプリが更新されたタイミングで勝手に有効化されるようです。  
目障りな場合は、以下のコマンドを実行してください
```
adb shell su -c  pm disable com.google.android.gms/.update.SystemUpdateActivity
```

また、｢**Google設定**｣が邪魔な場合は、以下のコマンドを実行してください
```
adb shell su -c pm disable com.google.android.gms/.app.settings.GoogleSettingsActivity
```

## アプリ

- **FirmwareUpdate**
  - 設定アプリからアクティビティを立ち上げた際に<br>設定アプリがクラッシュするのを防ぎます｡
- **GmsCore**
- **GoogleCalendarSyncAdapter**
- **GoogleContactsSyncAdapter**
- **GoogleServicesFramework**
- **Launcher3**
  - 既定のランチャーを置換します
- **Phonesky**

</details><details><summary><b>削除</b></summary>

## アプリ

- **DchaDataBox**
- **DchaService**  
  厳密には無効化してるだけです
- **DchaSystemSettings**
- **DchaSetupWizard**
- STS-Tottori 版 **Android SystemWebView**
- **QuickSearchBox**  
  - **Google** と競合するため

</details><details><summary><b>その他注意事項など</b></summary>

## Play ストアに欲しいアプリが無い

[**Aurora Store**](https://auroraoss.com/downloads/AuroraStore/Release/) を使ってください。  
初回ログインする前に、｢**偽装マネージャー**｣から、｢**Google Pixel 3A**｣を選択してください。

## SafetyNet を通したい

SafetyNetを通したり､一部アプリを動作させるためには [**PlayIntefrityFix**](https://github.com/chiteroman/PlayIntegrityFix/releases/latest) が必要です｡

2024/05/17 時点では、v15.9.8 で **Play Integrity** は **DEVICE** まで通ります。

## イヤホンが使えない

[***Lesser AudioSwitch**](https://play.google.com/store/apps/details?id=com.nordskog.LesserAudioSwitch&hl=ja_JP) を使用してください。

## パッケージインストーラーを使用したい場合

**`IGNORE_DCHA_COMPLETED`** を配置していても、スイッチが塞がれているため、設定アプリから有効化する事は出来ません。  
[![](https://github.com/s1204IT/CPadGApps/assets/52069677/3acba18f-da66-47f1-9472-2587efc69bc5)](#)

その為、以下の２通りの手段を用いて有効化する必要が有ります。

この例では、**Chrome** (`com.android.chrome`) を用います。

### ADB

**ADB**、**su**、**rish** を用いる場合は、次の通り実行してください。

```
adb shell appops set com.android.chrome REQUEST_INSTALL_PACKAGES allow
```
内部シェルの場合は、先頭の \[**`adb shell`**\] を除いて実行してください。

### AppOps

[**AppOps**](https://github.com/RikkaApps/App-Ops-issue-tracker/releases/tag/files) を用いると、シェルなどを用いずに、端末だけで簡単に有効化出来ます。

> [!NOTE]
> **AppOps** を使用するには、[**Shizuku**](https://github.com/RikkaApps/Shizuku/releases/latest) または [**Sui**](https://github.com/RikkaApps/Sui/releases/latest) (推奨) が必要です。

[![](https://github.com/s1204IT/CPadGApps/assets/52069677/744f8f96-19ef-416d-badb-fb7cd284fbd9)](#)

</details>
