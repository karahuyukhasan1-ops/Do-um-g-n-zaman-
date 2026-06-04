# 🎉 Doğum Günü Zamanı

Doğum günlerini istediğiniz saatte bildirim olarak gönderen akıllı bir Android uygulaması.

## 📱 Özellikler

- ➕ **Kişi Ekleme**: İsim ve doğum tarihini (Gün/Ay) kaydedebilirsiniz
- 🔔 **Özel Saat Bildirimi**: Her doğum günü, seçtiğiniz saatte bildirim gönderir
- ⏰ **Saat Seçimi**: Bildirimi görmek istediğiniz saati ve dakikayı belirleyebilirsiniz
- 📋 **Kişi Listesi**: Eklediğiniz tüm kişileri görebilirsiniz
- 🗑️ **Kişi Silme**: İstemediğiniz kişileri silebilirsiniz
- 💾 **Yerel Veri Tabanı**: Tüm veriler cihazınızda güvenli şekilde saklanır
- 🚀 **Hafif ve Hızlı**: Minimal kaynak kullanımı
- 🎯 **Güvenilir**: AlarmManager ile güvenilir bildirim gönderimi

## 🎯 Gereksinimler

- **Android Sürümü**: Android 13 ve üzeri
- **API Level**: Minimum 33 (Android 13)

## 📥 Kurulum ve İndirme

### ⬇️ En Kolay Yol - APK İndir (Önerilen)

1. [**Releases** bölümüne tıklayın](https://github.com/karahuyukhasan1-ops/Do-um-g-n-zaman-/releases)
2. En son sürümü bulun
3. **APK dosyasını indirin**
4. Android telefonunuzda dosyayı açın ve **Yükle** butonuna basın
5. Uygulamayı açın ve kullanmaya başlayın! 🎉

> 📌 **Not**: İlk açılışta "Bilinmeyen kaynak" uyarısı alabilirsiniz. Kurulum ayarlarından bilinmeyen kaynaklardan uygulama yüklemesine izin vermeniz gerekebilir.

### 👨‍💻 Geliştiriciler İçin - Proje Klonlama

Eğer kodu incelemek veya değiştirmek istiyorsanız:

```bash
git clone https://github.com/karahuyukhasan1-ops/Do-um-g-n-zaman-.git
cd Do-um-g-n-zaman-
```

**Android Studio'da Açın:**
- Android Studio'yu açın
- File → Open → Proje klasörünü seçin
- Gradle senkronizasyonunu bekleyin
- Run (▶️) butonuna basın

## 📖 Kullanım

### Kişi Ekleme
1. Ana ekrandaki **"+ Kişi Ekle"** butonuna tıklayın
2. Kişinin **adını** girin
3. Doğum **gün ve ayını** seçin (örn: 6 Ocak)
4. Bildirimi görmek istediğiniz **saati ve dakikayı** seçin
5. **Kaydet** butonuna tıklayın

### Bildirimleri Alma
- Her doğum günü, belirlediğiniz saatte otomatik olarak bildirim alacaksınız
- Örneğin: Eğer saati 09:30 olarak ayarladıysanız, doğum günü sabah 9'de 30 dakikada bildirim gelir
- Cihazınızın **bildirimleri etkinleştirilmiş** olması gerekir

### Kişi Silme
1. Listeden silmek istediğiniz kişiye tıklayın
2. **Sil (🗑️)** butonuna tıklayın
3. Kişi silinecektir

## 🛠️ Teknoloji Stack

- **Dil**: Kotlin
- **UI Framework**: Android XML Layout
- **Veri Tabanı**: Room Database
- **Bildirim Sistemi**: AlarmManager + Android Notifications
- **Mimari**: MVVM Pattern
- **Zamanlama**: AlarmManager + BroadcastReceiver

## 📦 Bağımlılıklar

- AndroidX Core
- Room Database
- Material Design

## 📝 Proje Yapısı

```
Do-um-g-n-zaman-/
├── app/
│   ├── src/main/
│   │   ├── java/com/example/dogumgunuzamani/
│   │   │   ├── MainActivity.kt
│   │   │   ├── BirthdayDatabase.kt
│   │   │   ├── BirthdayEntity.kt
│   │   │   ├── BirthdayDao.kt
│   │   │   ├── BirthdayNotificationWorker.kt
│   │   │   ├── BirthdayNotificationManager.kt
│   │   │   ├── BirthdayAdapter.kt
│   │   │   ├── BirthdayApp.kt
│   │   │   ├── AlarmScheduler.kt
│   │   │   └── BirthdayReceiver.kt
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   ├── activity_main.xml
│   │   │   │   └── birthday_item.xml
│   │   │   ├── values/
│   │   │   │   └── strings.xml
│   │   │   └── mipmap/
│   │   └── AndroidManifest.xml
│   └── build.gradle.kts
├── .github/workflows/
│   └── build-release.yml
└── README.md
```

## 🔐 İzinler

Uygulama aşağıdaki izinleri gerektirir:

- `POST_NOTIFICATIONS` - Bildirim göndermek için
- `SCHEDULE_EXACT_ALARM` - Tam saatte bildirim göndermek için

## 📋 Bildirim Saati Örnekleri

- **09:30** - Her doğum günü sabah 9'de 30 dakikada bildirim alırsınız
- **14:00** - Her doğum günü öğleden sonra 2'de bildirim alırsınız
- **00:00** - Her doğum günü gece yarısında bildirim alırsınız
- **21:45** - Her doğum günü akşam 9'de 45 dakikada bildirim alırsınız

## 🐛 Sorun Bildirimi

Herhangi bir sorun veya hata bulursanız, [GitHub Issues](https://github.com/karahuyukhasan1-ops/Do-um-g-n-zaman-/issues) kısmında bildirebilirsiniz.

## 💡 Gelecek Özellikler

- 📅 Takvim görünümü
- 🎵 Özel bildirim sesi
- 🎂 Yaş hesaplama ve gösterimi
- 📤 Kişileri dışa aktarma
- 🌙 Koyu tema desteği
- 🔔 Birden fazla bildirim seçeneği

## 📄 Lisans

Bu proje MIT Lisansı altında yayınlanmıştır.

---

**Yaratıcı**: karahuyukhasan1-ops  
**Son Güncelleme**: 2026  
**Durum**: 🚀 Aktif Geliştirme

### 🚀 APK İndirme Bağlantısı
[**→ En Son Sürümü İndir ←**](https://github.com/karahuyukhasan1-ops/Do-um-g-n-zaman-/releases)
