# 🎉 Doğum Günü Zamanı

Doğum günlerini o gün geldiği zaman bildirim olarak gönderen bir Android uygulaması.

## 📱 Özellikler

- ➕ **Kişi Ekleme**: İsim ve doğum tarihini (Gün/Ay) kaydedebilirsiniz
- 🔔 **Otomatik Bildirim**: Her doğum günü gece yarısında (00:00) bildirim gönderir
- 📋 **Kişi Listesi**: Eklediğiniz tüm kişileri görebilirsiniz
- 🗑️ **Kişi Silme**: İstemediğiniz kişileri silebilirsiniz
- 💾 **Yerel Veri Tabanı**: Tüm veriler cihazınızda güvenli şekilde saklanır
- 🚀 **Hafif ve Hızlı**: Minimal kaynak kullanımı

## 🎯 Gereksinimler

- **Android Sürümü**: Android 13 ve üzeri
- **API Level**: Minimum 33 (Android 13)

## 📥 Kurulum

### 1. Projeyi Klonlayın
```bash
git clone https://github.com/karahuyukhasan1-ops/Do-um-g-n-zaman-.git
cd Do-um-g-n-zaman-
```

### 2. Android Studio'da Açın
- Android Studio'yu açın
- "Open" seçeneğine tıklayın
- Proje klasörünü seçin

### 3. Uygulamayı Çalıştırın
- Bir emülatör veya fiziksel cihaz bağlayın
- "Run" butonuna tıklayın

## 📖 Kullanım

### Kişi Ekleme
1. Ana ekrandaki **"+ Kişi Ekle"** butonuna tıklayın
2. Kişinin **adını** girin
3. Doğum **gün ve ayını** seçin (örn: 6 Ocak)
4. **Kaydet** butonuna tıklayın

### Bildirimleri Alma
- Her doğum günü gece yarısında otomatik olarak bildirim alacaksınız
- Cihazınızın **bildirimleri etkinleştirilmiş** olması gerekir

### Kişi Silme
1. Listeden silmek istediğiniz kişiye uzun basın
2. **Sil** seçeneğine tıklayın

## 🛠️ Teknoloji Stack

- **Dil**: Kotlin
- **UI Framework**: Android XML Layout
- **Veri Tabanı**: Room Database
- **Bildirim Sistemi**: WorkManager + Android Notifications
- **Mimari**: MVVM Pattern

## 📦 Bağımlılıklar

- AndroidX Core
- Room Database
- WorkManager
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
│   │   │   └── BirthdayNotificationReceiver.kt
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   └── activity_main.xml
│   │   │   ├── values/
│   │   │   │   └── strings.xml
│   │   │   └── mipmap/
│   │   └── AndroidManifest.xml
│   └── build.gradle.kts
└── README.md
```

## 🔐 İzinler

Uygulama aşağıdaki izinleri gerektirir:

- `POST_NOTIFICATIONS` - Bildirim göndermek için
- `SCHEDULE_EXACT_ALARM` - Tam zamanında bildirim göndermek için
- `INTERNET` - (Gelecekteki özellikler için)

## 🐛 Sorun Bildirimi

Herhangi bir sorun veya hata bulursanız, GitHub Issues kısmında bildirebilirsiniz.

## 💡 Gelecek Özellikler

- 📅 Takvim görünümü
- 🎵 Özel bildirim sesi
- 🎂 Yaş hesaplama
- 📤 Kişileri dışa aktarma
- 🌙 Koyu tema desteği

## 📄 Lisans

Bu proje MIT Lisansı altında yayınlanmıştır.

---

**Yaratıcı**: karahuyukhasan1-ops  
**Son Güncelleme**: 2026  
**Durum**: 🚀 Aktif Geliştirme
