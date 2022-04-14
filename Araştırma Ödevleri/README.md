# Araştırma Ödevleri:

- [Araştırma Projesi 1 - Lateinit](#1)
- [Araştırma Projesi 2 - Tools Namespace](#2)


### <a name="1"></a> Araştırma Projesi 1

- Lateinit neden kullanıyoruz?
- Lateinit kullanımından bahseder misiniz?
- Lateinit için bir örnek kullanım gösterir misiniz ?

Kotlin, değişken tanımlarken değeriyle tanımlamamızı gerektiren bir dildir. (Lateinit:Late initialized) Lateinit keyword'ü, bir değişkene değer ataması yapma kısmını atlayarak tanımlamamıza olanak sağlar. Eğer initialized (değer atamadan) önce tanımlamaya çalışırsak Kotlin bize UninitializedPropertyAccessException hatasını verir.

class MainActivity : AppCompatActivity(), View.OnClickListener {

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
