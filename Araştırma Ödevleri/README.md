# Araştırma Ödevleri:

- [Araştırma Projesi 1 - Lateinit](#1)
- [Araştırma Projesi 2 - Tools Namespace](#2)


### <a name="1"></a> Araştırma Projesi 1

- Lateinit neden kullanıyoruz?
- Lateinit kullanımından bahseder misiniz?
- Lateinit için bir örnek kullanım gösterir misiniz ?

#### Cevaplar:

Kotlin, değişken tanımlarken değeriyle tanımlamamızı gerektiren bir dildir. (Lateinit:Late initialized) Lateinit keyword'ü, bir değişkene değer ataması yapma kısmını atlayarak tanımlamamıza olanak sağlar. Eğer initialized (değer atamadan) önce tanımlamaya çalışırsak Kotlin bize UninitializedPropertyAccessException hatasını verir.
Lateinit'le ilgili dikkat edilmesi gereken şeylerden biri lateinit'in primitive ve null tipli değişkenlerle kullanılamamasıdır. 

    private lateinit var button: Button
    private lateinit var button2: Button
    private lateinit var text1: TextView
    private lateinit var button3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setting the elements (buttons&texts)
        button=findViewById(R.id.button)
        text1=findViewById(R.id.textView)
        button2=findViewById(R.id.button2)
        button3=findViewById(R.id.button3)
    }


### <a name="2"></a> Araştırma Projesi 2


- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
- Neden kullanılmaktadır ?
- Nasıl kullanılmalıdır ?
- Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ? 

#### Cevaplar:

Namespace'inin temel kullanım amaçlarından birisi isim çatışmalarını önlemektir. Namespace'in büyük projelerdeki kullanımı önemlidir çünkü projelerde birçok insanın yer aldığı göz önünde bulundurulursa isim çatışması (isim çatışması: aynı isimlendirmenin tekrarlanması) olma ihtimali daha yüksektir. 

(namespace kullanmadan)

android:background="@color/<some-color>"

(namespace kullanarak)
    
tools:background="@color/<some-color>"
