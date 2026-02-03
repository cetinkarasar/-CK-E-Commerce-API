# CK E-Commerce API

Spring Boot tabanlı bir e-ticaret REST API projesi. Bu proje, kategori yönetimi için temel CRUD (Create, Read, Update, Delete) işlemlerini sağlar.

## 🚀 Özellikler

- **RESTful API**: Kategori yönetimi için REST endpoint'leri
- **Spring Boot 3.2.5**: Modern Spring Boot framework'ü
- **H2 Database**: Geliştirme için in-memory veritabanı
- **JPA/Hibernate**: Veritabanı işlemleri için ORM
- **Lombok**: Boilerplate kod azaltma
- **Validation**: Bean validation desteği
- **Global Exception Handling**: Merkezi hata yönetimi

## 📋 Gereksinimler

- Java 17 veya üzeri
- Maven 3.6+ veya Maven Wrapper
- IDE (IntelliJ IDEA, Eclipse, VS Code vb.)

## 🛠️ Kurulum

1. Projeyi klonlayın:
```bash
git clone https://github.com/kullanici-adi/ck-ecom.git
cd ck-ecom
```

2. Maven bağımlılıklarını yükleyin:
```bash
./mvnw clean install
```

veya Windows'ta:
```cmd
mvnw.cmd clean install
```

3. Uygulamayı çalıştırın:
```bash
./mvnw spring-boot:run
```

veya Windows'ta:
```cmd
mvnw.cmd spring-boot:run
```

Uygulama varsayılan olarak `http://localhost:8080` adresinde çalışacaktır.

## 📡 API Endpoints

### Kategori İşlemleri

#### Tüm Kategorileri Listele
```http
GET /api/public/categories
```

**Response:**
```json
[
  {
    "id": 1,
    "name": "Elektronik",
    "description": "Elektronik ürünler"
  }
]
```

#### Yeni Kategori Oluştur
```http
POST /api/public/categories
Content-Type: application/json

{
  "name": "Elektronik",
  "description": "Elektronik ürünler"
}
```

**Response:**
```
Category saved succesfully
```

#### Kategori Güncelle
```http
PUT /api/public/categories/{categoryId}
Content-Type: application/json

{
  "name": "Güncellenmiş Kategori",
  "description": "Güncellenmiş açıklama"
}
```

#### Kategori Sil
```http
DELETE /api/admin/categories/{categoryId}
```

## 🗄️ Veritabanı

Proje H2 in-memory veritabanı kullanmaktadır. H2 Console'a erişmek için:

- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:test`
- Username: `sa`
- Password: (boş bırakın)

## 📁 Proje Yapısı

```
ck-ecom/
├── src/
│   ├── main/
│   │   ├── java/com/ecommerce/project/
│   │   │   ├── controller/        # REST Controller'lar
│   │   │   ├── model/             # Entity sınıfları
│   │   │   ├── repositories/      # JPA Repository'ler
│   │   │   ├── service/           # Business logic
│   │   │   └── Exception/         # Exception handler'lar
│   │   └── resources/
│   │       └── application.properties
│   └── test/                      # Test dosyaları
├── pom.xml                        # Maven bağımlılıkları
└── README.md
```

## 🧪 Test

Testleri çalıştırmak için:
```bash
./mvnw test
```

## 🛡️ Exception Handling

Proje global exception handling ile donatılmıştır:
- `ResourceNotFoundException`: Kaynak bulunamadığında
- `APiException`: Genel API hataları için
- `MyGlobalExceptionHandler`: Tüm exception'ları yakalar

## 📝 Teknolojiler

- **Spring Boot**: 3.2.5
- **Java**: 17
- **Spring Data JPA**: Veritabanı işlemleri
- **H2 Database**: In-memory veritabanı
- **Lombok**: Kod azaltma
- **Spring Validation**: Veri doğrulama

## 🤝 Katkıda Bulunma

1. Bu repository'yi fork edin
2. Feature branch oluşturun (`git checkout -b feature/AmazingFeature`)
3. Değişikliklerinizi commit edin (`git commit -m 'Add some AmazingFeature'`)
4. Branch'inizi push edin (`git push origin feature/AmazingFeature`)
5. Bir Pull Request oluşturun

## 📄 Lisans

Bu proje açık kaynaklıdır ve MIT lisansı altında lisanslanmıştır.

## 👤 Yazar

Proje sahibi: [Adınız]

## 📞 İletişim

Sorularınız için issue açabilir veya pull request gönderebilirsiniz.

---

⭐ Bu projeyi beğendiyseniz yıldız vermeyi unutmayın!

