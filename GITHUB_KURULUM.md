# GitHub'a Proje Yükleme Rehberi

Bu rehber, projenizi GitHub'a yüklemek için adım adım talimatlar içerir.

## 📚 GitHub Nedir?

GitHub, yazılım geliştirme projelerinizi saklamak, paylaşmak ve işbirliği yapmak için kullanılan bir platformdur. Git versiyon kontrol sistemini kullanır ve kodunuzu bulut üzerinde saklar.

## 🚀 Adım Adım Kurulum

### 1. GitHub Hesabı Oluşturma

1. [GitHub.com](https://github.com) adresine gidin
2. "Sign up" butonuna tıklayın
3. E-posta adresinizi, şifrenizi ve kullanıcı adınızı girin
4. E-postanızı doğrulayın

### 2. Git Kurulumu (Eğer yüklü değilse)

Windows'ta Git'in yüklü olup olmadığını kontrol edin:
```powershell
git --version
```

Eğer yüklü değilse:
1. [Git for Windows](https://git-scm.com/download/win) adresinden indirin
2. Kurulumu tamamlayın
3. PowerShell'i yeniden başlatın

### 3. Git Yapılandırması (İlk kez kullanıyorsanız)

Terminal/PowerShell'de şu komutları çalıştırın:
```powershell
git config --global user.name "Adınız Soyadınız"
git config --global user.email "email@example.com"
```

### 4. Projeyi Git Repository'ye Dönüştürme

Proje klasörünüzde (ck-ecom) şu komutları sırayla çalıştırın:

```powershell
# Git repository'sini başlat
git init

# Tüm dosyaları staging area'ya ekle
git add .

# İlk commit'i yap
git commit -m "Initial commit: Spring Boot E-commerce API"
```

### 5. GitHub'da Yeni Repository Oluşturma

1. GitHub'a giriş yapın
2. Sağ üst köşedeki "+" işaretine tıklayın
3. "New repository" seçeneğini seçin
4. Repository bilgilerini doldurun:
   - **Repository name**: `ck-ecom` (veya istediğiniz isim)
   - **Description**: "Spring Boot E-commerce REST API"
   - **Visibility**: Public veya Private seçin
   - **Initialize this repository with**: Hiçbirini işaretlemeyin (README, .gitignore, license)
5. "Create repository" butonuna tıklayın

### 6. Projeyi GitHub'a Yükleme

GitHub'da repository oluşturduktan sonra, sayfada gösterilen komutları kullanabilirsiniz. Veya şu komutları kullanın:

```powershell
# GitHub repository'nizi remote olarak ekleyin
# NOT: YOUR_USERNAME kısmını kendi GitHub kullanıcı adınızla değiştirin
git remote add origin https://github.com/YOUR_USERNAME/ck-ecom.git

# Ana branch'i main olarak ayarlayın (eğer master kullanıyorsanız)
git branch -M main

# Projeyi GitHub'a push edin
git push -u origin main
```

**Önemli**: İlk push'ta GitHub kullanıcı adı ve şifre isteyebilir. Şifre yerine **Personal Access Token** kullanmanız gerekebilir.

### 7. Personal Access Token Oluşturma (Gerekirse)

Eğer şifre ile giriş yapamıyorsanız:

1. GitHub'da sağ üst köşedeki profil resminize tıklayın
2. "Settings" seçeneğine gidin
3. Sol menüden "Developer settings" seçin
4. "Personal access tokens" > "Tokens (classic)" seçin
5. "Generate new token" > "Generate new token (classic)" tıklayın
6. Token'a bir isim verin (örn: "ck-ecom-project")
7. Süre seçin (örn: 90 days veya No expiration)
8. "repo" scope'unu işaretleyin
9. "Generate token" butonuna tıklayın
10. **Token'ı kopyalayın** (bir daha gösterilmeyecek!)
11. Push yaparken şifre yerine bu token'ı kullanın

## 🔄 Sonraki Değişiklikleri Yükleme

Projede değişiklik yaptıktan sonra GitHub'a yüklemek için:

```powershell
# Değişiklikleri kontrol et
git status

# Değişiklikleri ekle
git add .

# Commit yap
git commit -m "Değişiklik açıklaması buraya"

# GitHub'a yükle
git push
```

## 📝 Örnek Commit Mesajları

- `git commit -m "Add category update endpoint"`
- `git commit -m "Fix validation error in Category model"`
- `git commit -m "Update README with API documentation"`
- `git commit -m "Add exception handling for invalid requests"`

## 🎯 Faydalı Git Komutları

```powershell
# Değişiklikleri göster
git status

# Commit geçmişini göster
git log

# Remote repository'leri göster
git remote -v

# Son commit'i geri al (dosyalar değişmeden)
git reset --soft HEAD~1

# Belirli bir dosyayı staging'den çıkar
git reset HEAD dosya-adi.java
```

## ⚠️ Önemli Notlar

1. **.gitignore dosyası**: Projenizde zaten bir `.gitignore` dosyası var. Bu dosya, `target/` klasörü gibi gereksiz dosyaların GitHub'a yüklenmesini engeller.

2. **Hassas Bilgiler**: `application.properties` dosyasında şifre, API key gibi hassas bilgiler varsa, bunları GitHub'a yüklemeyin. Bunun yerine `application.properties.example` gibi bir örnek dosya oluşturun.

3. **Branch Kullanımı**: Büyük değişiklikler için yeni branch oluşturmayı düşünün:
   ```powershell
   git checkout -b feature/yeni-ozellik
   # Değişiklikler yap
   git add .
   git commit -m "Yeni özellik eklendi"
   git push origin feature/yeni-ozellik
   ```

## 🎉 Başarılı!

Artık projeniz GitHub'da! Repository'nizin URL'si şu şekilde olacak:
`https://github.com/YOUR_USERNAME/ck-ecom`

Bu URL'yi paylaşarak başkalarının projenizi görmesini ve katkıda bulunmasını sağlayabilirsiniz.

## 📚 Daha Fazla Bilgi

- [Git Resmi Dokümantasyonu](https://git-scm.com/doc)
- [GitHub Guides](https://guides.github.com/)
- [GitHub Desktop](https://desktop.github.com/) - GUI ile Git kullanmak isterseniz

