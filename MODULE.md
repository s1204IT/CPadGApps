# CPadGApps for CT3
Googleサービスの追加やDcha系の削除､端末管理機能等の機能追加が含まれています。<br>
:warning: インストール直後は頻繁にGMSが停止します｡<br>
**ADB**もしくは**Play ストア**から***GMSを優先的に更新して下さい***｡
<details><summary><b>詳細</b></summary>

モジュールID：**CPadGApps-CT3**

バージョン：v1.5.0

Magiskは***必ず [v23.0](https://cdn.jsdelivr.net/gh/topjohnwu/magisk-files@23.0/app-release.apk)*** を使用して下さい｡<br>
SafetyNetを通したり､一部アプリを動作させるためには**MagiskHide**の機能が必要です｡
</details>

<details><summary><b>追加</b></summary>
OpenGApps : 20220215
※一部変更

## 機能

- **android.hardware.gamepad**
- **android.hardware.location**
- **android.hardware.location.network**
- **android.software.device_admin**
- **android.software.managed_users**
- **android.software.securely_removes_users**
- **com.google.android.maps**
- **com.google.android.media.effects**
- **com.google.widevine.software.drm**

## アプリ

- **CalculatorGoogle**
- **Chrome**
- **ConfigUpdater**
- **DchaSetupWizard**
  - 簡単に**Play ストア**を起動できます｡
- **DeskClockGoogle**
- **FilesGoogle**
- **FirmwareUpdate**
  - 設定アプリからアクティビティを立ち上げた際に<br>設定アプリがクラッシュするのを防ぎます｡
- **GmsCore**
- **GmsCoreSetup**
- **GoogleBackupTransport**
- **GoogleContactsSyncAdapter**
- **GoogleExtServices**
- **GoogleExtShared**
- **GoogleFeedback**
- **GoogleLoginService**
- **GoogleOneTimeInitializer**
- **GooglePartnerSetup**
- **GooglePrintRecommendationService**
- **GoogleServicesFramework**
- **GoogleTTS**
- **iWnnIME_oldskin** (更新)
- **Phonesky**
- **Photos**
- **SetupWizard**
- **talkback**
- **WallpaperPickerGoogle**
- **WebViewGoogle**

</details><details><summary><b>削除</b></summary>

## アプリ

- **DchaDataBox**
- **DchaService**
- **DchaSystemSettings**
- **DeskClock**
- **ExtServices**
- **ExtShared**
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
- **PrintRecommendationService**
- **Provision**

</details><details><summary><b>あえて追加しなかったもの</b></summary>

## 機能

 ([参照](https://developer.android.com/guide/topics/manifest/uses-feature-element?hl=ja "Android デベロッパー  |  Android Developers"))

- **android.hardware.location.gps**
  - 物理的にGPSモジュールが無いから
  - APIレベルが21以上だから

## アプリ
- **NexusLauncher**
  - 頻繁にクラッシュするため
- **Velvet** (GoogleQSB)
  - 端末自体の動作に大きく影響するため
- **YouTube** 及び **YouTube Music**
  - Vanced と言う手もあるため

</details><details><summary><b>その他注意事項</b></summary>

## TestDPCを利用する場合
[**TestDPC**](https://github.com/googlesamples/android-testdpc "googlesamples/android-testdpc")を利用する場合は、**必ず**バージョンが｢[**7.0.2**](https://github.com/googlesamples/android-testdpc/releases/tag/v7.0.2 "Release TestDPC 7.0.2 · googlesamples/android-testdpc")｣のものを利用し､絶対に更新を行わないでください｡
"***[User restrictions](https://developer.android.com/reference/android/os/UserManager?hl=ja "UserManager  |  Android Developers")***"が開けなくなります｡
Play ストアでの自動更新機能をオフにする事を強く推奨致します｡

</details><details><summary><b>既知の問題</b></summary>

- **Google Play開発者サービス**が更新をしないと必ずクラッシュする
  - 再起動前にネットワークから切断すると､<br>再起動後に更新し易くなります｡

</details><details><summary><b>検討</b></summary>

- クラッシュするGMSを､モジュールインストール後に自動でアップデートする機能の追加
