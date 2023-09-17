# CPadGApps for CT3
Googleサービスの追加やDcha系の削除､ 端末管理機能等の機能追加が含まれています。<br><br>
※再起動後､ ネットワークに接続した状態でしばらく待機する必要が有ります｡<br>
　自動処理が完了すると､ ホーム画面から**Play ストア**を開けるようになります｡
<details><summary><b>詳細</b></summary><br>

モジュールID：**CPadGApps-CT3**

バージョン：v1.7.1

Magiskは***必ず [v23.0](https://cdn.jsdelivr.net/gh/topjohnwu/magisk-files@23.0/app-release.apk)*** を使用して下さい｡<br>
SafetyNetを通したり､一部アプリを動作させるためには**MagiskHide**の機能が必要です｡
</details>

<details><summary><b>追加</b></summary><br>

OpenGApps : 20220215
※一部変更

## 機能

- **android.hardware.location**
- **android.hardware.location.network**
- **android.software.device_admin**
- **android.software.managed_users**
- **com.google.android.maps**
- **com.google.android.media.effects**
- **com.google.widevine.software.drm**

## アプリ

- **Chrome**
- **ConfigUpdater**
- **DchaSetupWizard**
  - 簡単に**Play ストア**を起動できます｡
- **Files**
- **FirmwareUpdate**
  - 設定アプリからアクティビティを立ち上げた際に<br>設定アプリがクラッシュするのを防ぎます｡
- **GmsCore**
- **GoogleBackupTransport**
- **GoogleContactsSyncAdapter**
- **GoogleFeedback**
- **GoogleLoginService**
- **GoogleOneTimeInitializer**
- **GooglePartnerSetup**
- **GoogleServicesFramework**
- **GoogleTTS**
- **iWnnIME_oldskin** (更新)
- **Phonesky**
- **Photos**
- **WallpaperPickerGoogle**
- **WebViewGoogle** (更新)

</details><details><summary><b>削除</b></summary>

## アプリ

- **chromium_webview**
- **DchaDataBox**
- **DchaService**
- **DchaSystemSettings**
- **Gallery2**
- **Gallery2Drm**
- **Gallery2Gif**
- **Gallery2PhotoPicker**
- **Gallery2Pq**
- **Gallery2PqTool**
- **Gallery2Raw**
- **Gallery2Root**
- **Gallery2StereoBackground**
- **Gallery2StereoCopyPaste**
- **Gallery2StereoFancyColor**
- **Gallery2StereoRefocus**
- **MtkBrowser**
- **OneTimeInitializer**
- **PicoTts**
- **QuickSearchBox**

</details><details><summary><b>あえて追加しなかったもの</b></summary>

## 機能

 ([参照](https://developer.android.com/guide/topics/manifest/uses-feature-element?hl=ja "Android デベロッパー  |  Android Developers"))

- **android.hardware.location.gps**
  - 物理的にGPSモジュールが無いから
  - APIレベルが21以上だから

## アプリ
- **NexusLauncher**
  - クラッシュするため
- **YouTube** 及び **YouTube Music**
  - ReVanced などの拡張アプリもあるため

</details><details><summary><b>その他注意事項</b></summary>

## TestDPCを利用する場合
[**TestDPC**](https://github.com/googlesamples/android-testdpc "googlesamples/android-testdpc")を利用する場合は、**必ず**バージョンが｢[**7.0.2**](https://github.com/googlesamples/android-testdpc/releases/tag/v7.0.2 "Release TestDPC 7.0.2 · googlesamples/android-testdpc")｣のものを利用し､絶対に更新を行わないでください｡  
"**Set user restrictions**"が開けなくなります｡
Play ストアでの自動更新機能をオフにする事を強く推奨致します｡  
[**ここ**](https://github.com/s1204IT/TestDPC)からGradleでビルドすると､ 最新バージョンでも問題なく動作します｡

</details>
