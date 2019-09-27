package com.kulineri.resepmakananindonesia.model;

import com.kulineri.resepmakananindonesia.R;

import java.util.ArrayList;

public class DataMakanan {
    private static String[] namaMakanan = {
            "Soto Mie Bogor",
            "Gado-Gado",
            "Ayam Taliwang",
            "Sate Padang",
            "Kerak Telor",
            "Papeda",
            "Tahu Gejrot",
            "Nasi Uduk",
            "Nasi Liwet",
            "Nasi Goreng"
    };

    private static String[] detilMakanan = {
            "Soto Mie Bogor adalah sajian mie dengan kuah kaldu yang menjadi salah satu masakan khas Sunda, khususnya di daerah Bogor, Jawa Barat. Soto mie Bogor sebenarnya punya kuah yang hampir sama seperti soto pada umumnya. Yang membedakan adalah isian utama yang dipakai berupa mie. Lalu diberi tambahan beberapa potongan risol bihun. Adapun di bawah ini bahan-bahan dan cara memasak Soto Mie Bogor itu sendiri.",
            "Gado-gado adalah salah satu makanan khas Betawi.  Gado-gado terdiri dari sayur-mayur yang direbus dan dicampur jadi satu, dengan bumbu kacang yang dihaluskan. Dilengkapi dengan irisan telur rebus, timun, tahu, serta bawang goreng dapat menambah kenikmatan. Biasanya sayuran yang digunakan adalah tauge, kol, kentang, bayam, dan lain sebagainya. Gado gado biasanya disajikan dengan irisan lontong.",
            "Ayam Taliwang adalah makanan khas Pulau Lombok dari Kampung Karang Taliwang, Kota Mataram, Nusa Tenggara Barat yang berbahan dasar daging ayam. Daging ayam yang disajikan berasal dari ayam kampung muda yang dibakar kemudian dibumbui dengan semacam saus yang bahannya antara lain cabai merah kering, bawang merah, bawang putih, tomat, terasi goreng, kencur, gula merah, dan garam. Makanan ini biasanya disajikan bersama makanan khas Lombok yang lain, misalnya plecing kangkung.",
            "Sate Padang adalah sebutan untuk tiga jenis varian sate di Sumatra Barat, yaitu Sate Padang, Sate Padang Panjang dan Sate Pariaman.\n" +
                    "\n" +
                    "Sate Padang memakai bahan daging sapi, lidah, atau jerohan (jantung, usus, dan tetelan)[1] dengan bumbu kuah kacang kental (mirip bubur) ditambah cabai yang banyak sehingga rasanya pedas.",
            "Kerak telur adalah makanan asli daerah Jakarta (Betawi), dengan bahan-bahan beras ketan putih, telur ayam, ebi (udang kering yang diasinkan) yang disangrai kering ditambah bawang merah goreng, lalu diberi bumbu yang dihaluskan berupa kelapa sangrai, cabai merah, kencur, jahe, merica butiran, garam dan gula pasir.",
            "Papeda atau bubur sagu adalah makanan pokok penduduk asli di Kepulauan Maluku dan Papua Barat. Papeda biasa ditemukan di Indonesia timur, sebagai makanan pokok mereka. \n" +
                    "\n" +
                    "Papeda terbuat dengan memasak tepung sagu dengan air hingga mengental. Papeda memiliki tekstur yang kenyal seperti lem dan biasanya dimakan bersamaan dengan sup ikan kuning.",
            "Tahu gejrot adalah makanan khas Cirebon, Indonesia yang terbuat dari tahu dan bumbu lainnya. Tahu gejrot terdiri dari tahu yang sudah digoreng kemudian dipotong agak kecil lalu dimakan dengan kuah yang bumbunya cabe, bawang putih, bawang merah, gula. Biasanya disajikan di layah kecil. Tahu gejrot juga merupakan jajanan khas daerah Cirebon yang digemari di kalangan anak-anak dan orang dewasa, karena sensasi rasanya yang khas.",
            "Nasi uduk atau dalam bahasa Belanda Rijst vermengd met onrust van de liefde atau disingkat Jaloerse rijst adalah nama makanan yang terbuat dari bahan dasar nasi putih yang diaron dan dikukus dengan santan, serta dibumbui dengan pala, kayu manis, jahe, daun serai dan merica. Nasi uduk biasa dihidangkan dengan emping goreng, tahu goreng, telur dadar / telur goreng yang teriris, dan abon kering, tempe, bawang goreng, ayam goreng, timun serta sambal kacang.",
            "Nasi liwet adalah makanan khas kota Solo dan merupakan kuliner asli daerah Baki, Kabupaten Sukoharjo. Nasi liwet adalah nasi gurih (dimasak dengan kelapa) mirip nasi uduk, yang disajikan dengan sayur labu siam, suwiran ayam (daging ayam dipotong kecil-kecil) dan areh (semacam bubur gurih dari kelapa).",
            "Nasi goreng merupakan makanan khas Indonesia, dan pada dasarnya sama seperti makanan Indonesia lainnya yang memiliki banyak sekali variasi. Meski sudah ada berbagai macam variasi, pada dasarnya nasi goreng adalah nasi yang digoreng yang kemudian ditambahi dengan berbagai bumbu untuk kenikmatan yang lebih lagi."
    };

    private static String bahan[] = {
            "250 gram daging sandung lamur\n" + "125 gram campuran kikil sapi\n" + "1 liter air\n" + "125 gram mie basah, siram air panas, tiriskan\n" +
                    "50 gram bihun basah, rendam sebentar dalam air panas\n" + "75 gram kol, iris halus\n" + "2 buah tomat, iris halus\n" +
                    "1  minyak untuk menggoreng\n" + "4 siung bawang putih\n" + "5 buah bawang merah\n" + "1 sdt garam\n" +
                    "3 buah kemiri\n" + "1/2 sdt merica butiran\n" + "1/2 batang daun bawang, iris halus\n" + "1/2 batang daun seledri, iris halus\n" +
                    "3 buah risol goreng, iris tipis\n" + "1 sdm bawang goreng\n" + "Emping goreng\n" + "Cuka\n" + "Garam\n" +
                    "Kecap manis\n" + "Sambal\n" + "Air jeruk limau",
            "50 gram taoge, buang akarnya, seduh dengan air mendidih, langsung tiriskan\n" + "150 gram sayur kangkung, potong-potong, rebus, langsung tiriskan\n" +
                    "150 gram sayur bayam, petik daunnya, rebus, langsung tiriskan\n" + "200 gram sayur pare, buang bijinya, kemudian direbus\n" +
                    "1 buah tahu (8X8 cm) kemudian digoreng\n" + "1 potong tempe (8X8 cm) kemudian digoreng\n" + "1 - 2 sdm bawang goreng\n" +
                    "3 butir telur rebus, kupas kulitnya emping dan kerupuk goreng\n" + "200 gram kacang tanah, yang digoreng\n" +
                    "2 buah cabai merah\n" + "5 buah cabai rawit\n" + "1 sdt garam\n" + "1/2 sdt terasi\n" + "1 sdm gula merah\n" + "200 cc air matang",
            "1 ekor ayam kampung ukuran sedang\n" + "150 ml santan kental \n" + "2 sdm minyak goreng \n" + "3 siung bawang putih \n" + "2 butir kemiri \n" + "3 buah cabai besar kering \n" +
                    "5 buah cabai rawit \n" + "1/2 sdt terasi \n" + "garam secukupnya",
            "6 siung bawang merah\n" + "4 siung bawang putih\n" + "6 cm kunyit\n" + "1 sdm ketumbar\n" + "8 buah cabai keriting\n" + "1 sdt jinten\n" + "3 cm jahe\n" + "5 lbr daun jeruk\n"
                    + "2 batang serai\n" + "5 cm lengkuas\n" + "1 sdm garam\n" + "50 gram tepung beras\n" + "600 ml air\n" + "100 gram kacang tanah, sangrai, tumbuk kasar\n",
            "100 gr beras ketan putih, dicuci bersih dan direndam dengan air kurang lebih 2 jam\n" + "4 butir telur bebek\n" + "4 sdm bawang goreng\n" +
                    "4 sdm serundeng\n" + "4 buah cabai rawit, iris halus\n" + "2 sdt garam\n" + "1 sdt lada bubuk\n" + "1 sdt gula pasir\n" + "4 sdm ebi bubuk\n",
            "250 gram Tepung sagu\n" + "2 siung Bawang putih \n" + "1/2 sdm Garam \n" + "4 gelas Air \n",
            "10 buah Tahu sumedang \n" + "1 sdm kecap manis\n" + "1 sdm kecap asin\n" + "2 sdm air asam jawa\n" + "Gula merah (sisir halus, 3 sdm)\n" +
                    "1/2 gelas air putih\n" + "Minyak goreng panas (secukupnya)\n" + "4 siung bawang merah\n" + "2 siung bawang putih\n" + "9 buah cabai rawit \n" + "Garam (secukupnya)",
            "300 g Beras , cuci bersih\n" + "450 ml Santan kelapa kental \n" + "2 lbr Daun salam muda \n" + "2 butir Cengkeh \n" +
                    "2 batang Serai , memarkan\n" + "2 cm Kayu manis \n" + "1 sdt Merica \n" + "1 sdt Garam ",
            "4 gelas takar beras \n" + "6 ekor cumi asin (rendam air panas, potong sesuai keinginan) \n" + "3 lbr daun salam \n" +
                    "2 batang serai digeprek \n" + "4 biji cabai merah (iris kasar) \n" + "garam secukupnya \n" + "5 sdm minyak goreng ",
            "2 piring nasi\n" + "3 buah cabai merah besar, potong-potong\n" + "3 buah cabai rawit, cincang halus\n" + "5 butir bawang merah, cincang halus\n" +
                    "2 siung bawang putih, cincang halus\n" + "1/2 sdt terasi matang\n" + "2 sdm kecap manis\n" + "1 sdt garam\n" + "1 butir telur ayam\n" +
                    "Ayam suwir secukupnya\n" + "Minyak goreng"
    };

    private static String cara[] = {
            "1. Pertama rebus kikil, daging, dan usus hingga empuk. Keluarkan kikil, usus dan daging , lalu iris kecil-kecil. Sisihkan. Tiriskan kaldu, didihkan kembali.\n" +
                    "2. Haluskan bawang putih, bawang merah, kemiri, merica, dan garam.\n" +
                    "3. Tumis bumbu yang telah dihaluskan hingga harum.Masukkan ke dalam kaldu.\n" +
                    "4. Cara Penyajian : taruh dalam mangkuk saji, mie, bihun,kol, tomat, risoles, campuran daging, kikil atau usus, daun bawang, daun seledri, tomat, emping, bawang goreng. Tuang kuah kaldu ke dalamnya.\n" +
                    "5. Tambahkan cuka, kecap manis, air jeruk limau dan sambal.\n" +
                    "6. Sajikan dengan Pelengkap: risol kampung/risol isi bihun.",
            "1. Kupas kulit kacang kemudian sangrai.\n" +
                    "2. Kemudian rebus kacang bersama santan, cabai merah dan cabai rawit yang sudah digoreng, terasi, gula merah dan garam, campur semua bahan untuk sambal sausnya, kemudian masak hingga mendidih, lalu angkat dan sisihkan. Kemudian haluskan bersamaan dengan kacang.\n" +
                    "3. Rebus bahan-bahan sayuran, seperti bayam, kangkung, pare, serta telur.\n" +
                    "4. Goreng tahu dan tempenya.\n" +
                    "5. Hidangkan rapi di piring, sayur-sayuran dan tambahkan potongan telur. Kemudian taburi bawang goreng dan remasan kerupuk atau emping di atasnya. Siram dengan sambal saus kacang. Gago-gado siap disajikan.\n",
            "1. Bersihkan ayam, belah bagian dada dan keluarkan isi perutnya.\n" +
                    "2. Lumuri ayam dengan sedikit garam hingga rata.\n" +
                    "3. Tusuk Ayam dengan bambu, goreng hingga setengah matang. Angkat dan tiriskan.\n" +
                    "4. Panggang di atas bara api hingga matang sambil sesekali dibalik. Angkat dan sisihkan.\n" +
                    "5. Bumbu: Haluskan bawang putih, kemiri, cabai, terasi, dan garam. Panaskan minyak, tumis bumbu halus hingga harum. Tuang santan, masak hingga mendidih dan matang. Angkat.\n" +
                    "6. Pukul ayam hingga memar jangan sampai hancur. Oles permukaannya dengan bumbu hingga rata.\n" +
                    "7. Panggang ayam hingga bumbu meresap sambil sesekali diolesi bumbu. Angkat. Sajikan.\n",
            "1. Sangrai ketumbar dan jinten, sisihkan.\n" +
                    "2. Masukkan bawang merah, bawang putih, kunyit, jahe, lengkuas, cabai keriting dan bumbu ketumbar, serta jinten yang disangrai. Haluskan dalam food processor.\n" +
                    "3. Tumis bumbu halus hingga harum, tambahkan serai, daun jeruk, dan garam. Sisihkan setelah bumbu terlihat sedikit kering.\n" +
                    "4. Didihkan air, masukkan bumbu yang telah dibalut.\n" +
                    "5. Selanjutnya masukkan daging sapi untuk sate ke dalamnya, rebus selama satu jam atau hingga air berkurang setengahnya.\n" +
                    "6. Ambil dan tiriskan daging, biarkan air bumbu tetap di atas kompor.\n" +
                    "7. Ambil sedikit air sisa rebusan ke dalam mangkuk, lalu campur dengan tepung beras. Kemudian masukkan kembali campuran kuah dan tepung beras tersebut ke dalam panci.\n" +
                    "8. Masukkan kacang tanah yang sudah disangrai. Aduk merata hingga tekstur saus mengental.\n",
            "1. Panaskan penggorengan kerak telur hingga cukup panas.\n" +
                    "2. Masukkan satu sendok makan sayur ketan yang sudah direndam beserta airnya (sekitar 50 gr), tutup dan masak kurang lebih 2 – 3 menit.\n" +
                    "3. Buka tutupnya, kemudian beri 2 butir telur, 2 sdm bawang goreng, 2 sdm serundeng, 2 sdm ebi, 2 buah cabai rawit, 1 sdt garam, 1/2 sdt lada bubuk dan 1/2 sdt gula pasir, aduk rata.\n" +
                    "4. Ratakan disisi penggorengan kurang lebih berdiameter 20 cm, tutup dan masak kembali hingga harum\n" +
                    "5. Balik penggorengan kerak telur hingga terjilat api dan permukaan atas harum terbakar.\n" +
                    "6. Lalukan cara yang sama untuk bikin kerak telur yang berikutnya. Sajikan.\n",
            "1. Dalam panci, didihkan 3 gelas air. Sisihkan.\n" +
                    "2. Dalam panci yang lain, campur tepung sagu, bawang putih, garam, dan 1 gelas air. Aduk rata.\n" +
                    "3. Ambil air yang telah mendidih lalu tuangkan secara perlahan ke dalam campuran tepung sagu.\n" +
                    "4. Masak campuran tepung sagu dengan api kecil sambil terus diaduk hingga mengental. Angkat dan siap disajikan.\n",
            "1. Potong-potong tahu lalu sisihkan sebentar.\n" +
                    "2. Masak air bersama gula merah, kecap manis, kecap asin, gula merah dan air asam jawa sampai mendidih. Sisihkan sebentar.\n" +
                    "3. Siapkan cobek lalu ulek kasar bawang merah, bawang putih, cabai rawit, dan garam yang telah disiapkan. Siram dengan sedikit minyak panas. \n" +
                    "4. Tuang tahu ke dalam cobek lalu aduk rata dengan bumbu. \n" +
                    "5. Terakhir, siram tahu dengan air asam jawa dan gula merah yang telah dibuat sebelumnya. Tahu gejrot pun siap untuk disantap.\n",
            "1. Rebus santan dan masukkan pula daun salam, cengkeh, serai, kayu manis, merica, dan garam. Aduk hingga mendidih.\n" +
                    "2. Campurkan santan dan beras. Kukus hingga beras matang atau jadi nasi.\n" +
                    "3. Nasi uduk siap disajikan.\n",
            "1. Cuci bersih beras, tambahkan air, lalu masak seperti masak nasi biasa. \n" +
                    "2. Goreng bawang merah dan bawang putih hingga wangi, jangan sampai kering. Masukkan bawangnya ke dalam beras. Simpan minyak bekas menggoreng bawangnya. \n" +
                    "3. Masukkan semua bahan yang ada, aduk-aduk agar merata. Nyalakan rice cooker dan tunggu hingga matang. \n" +
                    "4. Setelah matang, biarkan lima menit baru buka tutupnya. Kemudian masukkan minyak goreng bekas goreng bawang tadi. Aduk-aduk merata, lalu sajikan.\n",
            "1. Haluskan cabai merah, cabai rawit, bawang merah, bawang putih, dan garam.\n" +
                    "2. Panaskan minyak dan tumis bumbu halus sampai matang.\n" +
                    "3. Tambahkan 1 butir telur ayam dan ayam suwir, tumis hingga telur ayam, ayam suwir dan bumbu halus tercampur merata.\n" +
                    "4. Tambahkan nasi dan masak sampai berubah warna.\n" +
                    "5. Masukkan kecap manis, aduk nasi goreng dengan api kecil saja.\n" +
                    "6. Angkat dan sajikan.\n"
    };

    private static int[] fotoMakanan = {
            R.drawable.soto_mie,
            R.drawable.gado,
            R.drawable.ayam_taliwang,
            R.drawable.sate_padang,
            R.drawable.kerak_telor,
            R.drawable.papeda,
            R.drawable.gejrot,
            R.drawable.nasiuduk,
            R.drawable.liwet,
            R.drawable.nasigoreng
    };

    public static ArrayList<Makanan> getListData() {
        ArrayList<Makanan> list = new ArrayList<>();
        for (int position = 0; position < namaMakanan.length; position++) {
            Makanan food = new Makanan();
            food.setName(namaMakanan[position]);
            food.setDetail(detilMakanan[position]);
            food.setPhoto(fotoMakanan[position]);
            food.setBahan(bahan[position]);
            food.setCara(cara[position]);
            list.add(food);
        }
        return list;
    }
}
