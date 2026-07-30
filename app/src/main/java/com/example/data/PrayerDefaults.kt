package com.example.data

object PrayerDefaults {

    fun getSholatDefaults(): List<PrayerItem> {
        return listOf(
            PrayerItem(
                id = "sholat_1",
                title = "1. Niat Shalat Subuh",
                mainCategory = "Bacaan Sholat",
                subCategory = "Ibadah",
                description = "Niat shalat subuh dua rakaat menghadap kiblat karena Allah Ta'ala.",
                verses = listOf(
                    Verse(
                        number = 1,
                        arabic = "أُصَلِّى فَرْضَ الصُّبْحِ رَكْعَتَيْنِ مُسْتَقْبِلَ الْقِبْلَةِ أَدَاءً لِلَّهِ تَعَالَى",
                        latin = "Ushallii fardhas-subhi rak'ataini mustaqbilal-qiblati adaa'an lillaahi ta'aala.",
                        translation = "Aku berniat shalat fardhu Subuh dua rakaat menghadap kiblat karena Allah Ta'ala."
                    )
                )
            ),
            PrayerItem(
                id = "sholat_2",
                title = "2. Takbiratul Ihram",
                mainCategory = "Bacaan Sholat",
                subCategory = "Ibadah",
                description = "Membaca takbir pembuka shalat sambil mengangkat kedua tangan setinggi telinga.",
                verses = listOf(
                    Verse(
                        number = 1,
                        arabic = "اللَّهُ أَكْبَرُ",
                        latin = "Allaahu Akbar.",
                        translation = "Allah Maha Besar."
                    )
                )
            ),
            PrayerItem(
                id = "sholat_3",
                title = "3. Doa Iftitah",
                mainCategory = "Bacaan Sholat",
                subCategory = "Ibadah",
                description = "Membaca doa pembuka setelah takbiratul ihram.",
                verses = listOf(
                    Verse(
                        number = 1,
                        arabic = "اللَّهُ أَكْبَرُ كَبِيرًا وَالْحَمْدُ لِلَّهِ كَثِيرًا وَسُبْحَانَ اللَّهِ بُكْرَةً وَأَصِيلاً",
                        latin = "Allaahu akbaru kabiiraw-walhamdu lillaahi katsiiraw-wa subhaanallaahi bukrataw-wa ashiilaa.",
                        translation = "Allah Maha Besar lagi Sempurna Kebesaran-Nya, segala puji bagi Allah dengan pujian yang banyak, dan Maha Suci Allah sepanjang pagi dan petang."
                    ),
                    Verse(
                        number = 2,
                        arabic = "إِنِّى وَجَّهْتُ وَجْهِىَ لِلَّذِى فَطَرَ السَّمَاوَاتِ وَالأَرْضَ حَنِيفًا مُسْلِمًا وَمَا أَنَا مِنَ الْمُشْرِكِينَ",
                        latin = "Innii wajjahtu wajhiya lilladzii fatharas-samaawaati wal-ardha haniifam-muslimaw-wamaa ana minal-musyrikiin.",
                        translation = "Kuhadapkan wajahku kepada Zat yang menciptakan langit dan bumi dengan lurus dan berserah diri, dan aku bukanlah termasuk orang-orang yang musyrik."
                    ),
                    Verse(
                        number = 3,
                        arabic = "إِنَّ صَلاَتِى وَنُسُكِى وَمَحْيَايَ وَمَمَاتِى لِلَّهِ رَبِّ الْعَالَمِينَ ، لاَ شَرِيكَ لَهُ وَبِذَلِكَ أُمِرْتُ وَأَنَا مِنَ الْمُسْلِمِينَ",
                        latin = "Inna shalaatii wa nusukii wa mahyaaya wa mamaatii lillaahi rabbil-'aalamiin, laa syariika lahu wa bidzaalika umirtu wa ana minal-muslimiin.",
                        translation = "Sesungguhnya shalatku, ibadahku, hidupku dan matiku hanyalah untuk Allah Tuhan semesta alam, tidak ada sekutu bagi-Nya, dan demikianlah yang diperintahkan kepadaku, dan aku adalah termasuk orang-orang berserah diri."
                    )
                )
            ),
            PrayerItem(
                id = "sholat_4",
                title = "4. Surah Al-Fatihah",
                mainCategory = "Bacaan Sholat",
                subCategory = "Ibadah",
                description = "Surah wajib dalam setiap rakaat shalat.",
                verses = listOf(
                    Verse(1, "بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ", "Bismillaahir-rahmaanir-rahiim.", "Dengan nama Allah Yang Maha Pengasih lagi Maha Penyayang."),
                    Verse(2, "الْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِينَ", "Al-hamdu lillaahi rabbil-'aalamiin.", "Segala puji bagi Allah, Tuhan seluruh alam."),
                    Verse(3, "الرَّحْمَٰنِ الرَّحِيمِ", "Ar-rahmaanir-rahiim.", "Yang Maha Pengasih lagi Maha Penyayang."),
                    Verse(4, "مَالِكِ يَوْمِ الدِّينِ", "Maaliki yaumid-diin.", "Pemilik hari pembalasan."),
                    Verse(5, "إِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ", "Iyyaaka na'budu wa iyyaaka nasta'iin.", "Hanya kepada Engkaulah kami menyembah dan hanya kepada Engkaulah kami memohon pertolongan."),
                    Verse(6, "اهْدِنَا الصِّرَاطَ الْمُسْتَقِيمَ", "Ihdinas-shiraatal-mustaqiim.", "Tunjukkanlah kami jalan yang lurus."),
                    Verse(7, "صِرَاطَ الَّذِينَ أَنْعَمْتَ عَلَيْهِمْ غَيْرِ الْمَغْضُوبِ عَلَيْهِمْ وَلَا الضَّالِّينَ", "Shiraatalladziina an'amta 'alaihim ghairil-maghdhuubi 'alaihim wa lad-dhaalliin.", "(Yaitu) jalan orang-orang yang telah Engkau beri nikmat kepadanya; bukan (jalan) mereka yang dimurkai dan bukan (pula jalan) mereka yang sesat.")
                )
            ),
            PrayerItem(
                id = "sholat_5",
                title = "5. Surah Al-Ikhlas",
                mainCategory = "Bacaan Sholat",
                subCategory = "Ibadah",
                description = "Contoh surah pendek yang dibaca setelah Al-Fatihah.",
                verses = listOf(
                    Verse(1, "قُلْ هُوَ اللَّهُ أَحَدٌ", "Qul huwallaahu ahad.", "Katakanlah (Muhammad): Dia-lah Allah, Yang Maha Esa."),
                    Verse(2, "اللَّهُ الصَّمَدُ", "Allaahus-shamad.", "Allah tempat meminta segala sesuatu."),
                    Verse(3, "لَمْ يَلِدْ وَلَمْ يُولَدْ", "Lam yalid wa lam yuulad.", "(Allah) tidak beranak dan tidak pula diperanakkan,"),
                    Verse(4, "وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌ", "Wa lam yakul-lahu kufuwan ahad.", "dan tidak ada sesuatu pun yang setara dengan Dia.")
                )
            ),
            PrayerItem(
                id = "sholat_6",
                title = "6. Ruku' & Tasbih",
                mainCategory = "Bacaan Sholat",
                subCategory = "Ibadah",
                description = "Dibaca sebanyak 3 kali saat membungkukkan badan.",
                verses = listOf(
                    Verse(1, "سُبْحَانَ رَبِّيَ الْعَظِيمِ وَبِحَمْدِهِ", "Subhaana rabbiyal-'azhiimi wa bihamdih. (3x)", "Maha Suci Tuhanku Yang Maha Agung dan dengan memuji-Nya.")
                )
            ),
            PrayerItem(
                id = "sholat_7",
                title = "7. I'tidal & Doa",
                mainCategory = "Bacaan Sholat",
                subCategory = "Ibadah",
                description = "Dibaca saat bangkit dari ruku' hingga berdiri tegak.",
                verses = listOf(
                    Verse(1, "سَمِعَ اللَّهُ لِمَنْ حَمِدَهُ", "Sami'allaahu liman hamidah.", "Allah mendengar orang yang memuji-Nya."),
                    Verse(2, "رَبَّنَا لَكَ الْحَمْدُ مِلْءَ السَّمَاوَاتِ وَمِلْءَ الأَرْضِ وَمِلْءَ مَا شِئْتَ مِنْ شَىْءٍ بَعْدُ", "Rabbanaa lakal-hamdu mil'as-samaawaati wa mil'al-ardhi wa mil'a maa syi'ta min syai'in ba'du.", "Ya Tuhan kami, bagi-Mu lah segala puji, sepenuh langit dan bumi dan sepenuh apa yang Engkau kehendaki setelah itu.")
                )
            ),
            PrayerItem(
                id = "sholat_8",
                title = "8. Sujud & Tasbih",
                mainCategory = "Bacaan Sholat",
                subCategory = "Ibadah",
                description = "Dibaca sebanyak 3 kali saat bersujud.",
                verses = listOf(
                    Verse(1, "سُبْحَانَ رَبِّيَ الأَعْلَى وَبِحَمْدِهِ", "Subhaana rabbiyal-a'laa wa bihamdih. (3x)", "Maha Suci Tuhanku Yang Maha Tinggi dan dengan memuji-Nya.")
                )
            ),
            PrayerItem(
                id = "sholat_9",
                title = "9. Duduk Antara Dua Sujud",
                mainCategory = "Bacaan Sholat",
                subCategory = "Ibadah",
                description = "Doa memohon ampunan dan rahmat saat duduk di antara dua sujud.",
                verses = listOf(
                    Verse(1, "رَبِّ اغْفِرْ لِي وَارْحَمْنِي وَاجْبُرْنِي وَارْفَعْنِي وَارْزُقْنِي وَاهْدِنِي وَعَافِنِي وَاعْفُ عَنِّي", "Rabbighfir lii warhamnii wajburnii warfa'nii warzuqnii wahdinii wa 'aafinii wa'fu 'annii.", "Ya Allah, ampunilah aku, rahmmatilah aku, cukupkanlah kekuranganku, tinggikanlah derajatku, berilah aku rezeki, berilah aku petunjuk, sehatkanlah aku, dan maafkanlah aku.")
                )
            ),
            PrayerItem(
                id = "sholat_10",
                title = "10. Doa Qunut Subuh",
                mainCategory = "Bacaan Sholat",
                subCategory = "Ibadah",
                description = "Dibaca pada rakaat kedua shalat Subuh saat i'tidal sebelum sujud.",
                verses = listOf(
                    Verse(1, "اللَّهُمَّ اهْدِنِي فِيمَنْ هَدَيْتَ ، وَعَافِنِي فِيمَنْ عَافَيْتَ ، وَتَوَلَّنِي فِيمَنْ تَوَلَّيْتَ", "Allaahummahdinii fiiman hadait, wa 'aafinii fiiman 'aafait, wa tawallanii fiiman tawallait,", "Ya Allah berilah aku petunjuk sebagaimana orang-orang yang telah Engkau beri petunjuk, berilah aku kesehatan sebagaimana orang-orang yang telah Engkau beri kesehatan, lindungilah aku sebagaimana orang-orang yang telah Engkau lindungi,"),
                    Verse(2, "وَبَارِكْ لِي فِيمَا أَعْطَيْتَ ، وَقِنِي شَرَّ مَا قَضَيْتَ ، فَإِنَّكَ تَقْضِي وَلاَ يُقْضَى عَلَيْكَ", "Wa baarik lii fiimaa a'thait, wa qinii syarra maa qadhait, fa innaka taqdhii wa laa yuqdhaa 'alaik,", "berkahilah bagiku apa yang telah Engkau berikan, dan peliharalah aku dari kejahatan yang telah Engkau tetapkan. Sesungguhnya Engkaulah yang menetapkan dan tidak ada yang dapat menetapkan atas-Mu,"),
                    Verse(3, "وَإِنَّهُ لاَ يَذِلُّ مَنْ وَالَيْتَ ، وَلاَ يَعِزُّ مَنْ عَادَيْتَ ، تَبَارَكْتَ رَبَّنَا وَتَعَالَيْتَ", "Wa innahu laa yadzillu maw-waalait, wa laa ya'izzu man 'aadait, tabaarakta rabbanaa wa ta'aalait,", "dan sesungguhnya tidak akan terhina orang yang Engkau lindungi, dan tidak akan mulia orang yang Engkau musuhi. Maha Suci Engkau wahai Tuhan kami dan Maha Tinggi Engkau,"),
                    Verse(4, "فَلَكَ الْحَمْدُ عَلَى مَا قَضَيْتَ ، أَسْتَغْفِرُكَ وَأَتُوبُ إِلَيْكَ ، وَصَلَّى اللَّهُ عَلَى سَيِّدِنَا مُحَمَّدٍ النَّبِيِّ الأُمِّيِّ وَعَلَى آلِهِ وَصَحْبِهِ وَسَلَّمَ", "Fa lakal-hamdu 'alaa maa qadhait, astaghfiruka wa atuubu ilaik, wa shallallaahu 'alaa sayyidinaa muhammadinin-nabiyyil-ummiyyi wa 'alaa aalihi wa shahbihi wa sallam.", "Maka bagi-Mu segala puji atas apa yang telah Engkau tetapkan. Aku memohon ampunan-Mu dan bertaubat kepada-Mu, dan semoga Allah melimpahkan shalawat dan salam kepada junjungan kami Nabi Muhammad, Nabi yang ummi, serta kepada keluarga dan para sahabatnya.")
                )
            ),
            PrayerItem(
                id = "sholat_11",
                title = "11. Tahiyat Akhir",
                mainCategory = "Bacaan Sholat",
                subCategory = "Ibadah",
                description = "Dibaca pada duduk terakhir sebelum salam.",
                verses = listOf(
                    Verse(1, "التَّحِيَّاتُ الْمُبَارَكَاتُ الصَّلَوَاتُ الطَّيِّبَاتُ لِلَّهِ", "At-tahiyyaatul-mubaarakaatus-shalawaatut-thayyibaatu lillaah.", "Segala kehormatan, keberkahan, shalawat, dan kebaikan adalah milik Allah."),
                    Verse(2, "السَّلاَمُ عَلَيْكَ أَيُّهَا النَّبِيُّ وَرَحْمَةُ اللَّهِ وَبَرَكَاتُهُ", "As-salaamu 'alaika ayyuhan-nabiyyu wa rahmatullaahi wa barakaatuh.", "Semoga keselamatan, rahmat Allah, dan berkah-Nya tercurah kepadamu wahai Nabi."),
                    Verse(3, "السَّلاَمُ عَلَيْنَا وَعَلَى عِبَادِ اللَّهِ الصَّالِحِينَ", "As-salaamu 'alainaa wa 'alaa 'ibaadillaahis-shaalihiin.", "Semoga keselamatan tercurah kepada kami dan kepada hamba-hamba Allah yang saleh."),
                    Verse(4, "أَشْهَدُ أَنْ لاَ إِلَهَ إِلاَّ اللَّهُ وَأَشْهَدُ أَنَّ مُحَمَّدًا رَسُولُ اللَّهِ", "Asyhadu allaa ilaaha illallaah wa asyhadu anna muhammadar-rasuulullaah.", "Aku bersaksi bahwa tidak ada Tuhan selain Allah, dan aku bersaksi bahwa Muhammad adalah utusan Allah.")
                )
            ),
            PrayerItem(
                id = "sholat_12",
                title = "12. Shalawat Nabi dalam Tahiyat",
                mainCategory = "Bacaan Sholat",
                subCategory = "Ibadah",
                description = "Shalawat Ibrahimiyah dibaca dalam tahiyat akhir.",
                verses = listOf(
                    Verse(1, "اللَّهُمَّ صَلِّ عَلَى مُحَمَّدٍ وَعَلَى آلِ مُحَمَّدٍ كَمَا صَلَّيْتَ عَلَى إِبْرَاهِيمَ وَعَلَى آلِ إِبْرَاهِيمَ", "Allaahumma shalli 'alaa muhammad wa 'alaa aali muhammad kamaa shallaita 'alaa ibraahiim wa 'alaa aali ibraahiim.", "Ya Allah, limpahkanlah shalawat kepada Muhammad dan keluarga Muhammad sebagaimana Engkau melimpahkan shalawat kepada Ibrahim dan keluarga Ibrahim."),
                    Verse(2, "وَبَارِكْ عَلَى مُحَمَّدٍ وَعَلَى آلِ مُحَمَّدٍ كَمَا بَارَكْتَ عَلَى إِبْرَاهِيمَ وَعَلَى آلِ إِبْرَاهِيمَ فِي الْعَالَمِينَ إِنَّكَ حَمِيدٌ مَجِيدٌ", "Wa baarik 'alaa muhammad wa 'alaa aali muhammad kamaa baarakta 'alaa ibraahiim wa 'alaa aali ibraahiim fil-'aalamiina innaka hamiidum-majiid.", "Dan berkahilah Muhammad dan keluarga Muhammad sebagaimana Engkau memberkahi Ibrahim dan keluarga Ibrahim di seluruh alam, sesungguhnya Engkau Maha Terpuji lagi Maha Mulia.")
                )
            ),
            PrayerItem(
                id = "sholat_13",
                title = "13. Salam",
                mainCategory = "Bacaan Sholat",
                subCategory = "Ibadah",
                description = "Salam penutup shalat dengan menoleh ke kanan dan ke kiri.",
                verses = listOf(
                    Verse(1, "السَّلاَمُ عَلَيْكُمْ وَرَحْمَةُ اللَّهِ", "As-salaamu 'alaikum wa rahmatullaah.", "Semoga keselamatan dan rahmat Allah tercurah kepada kalian.")
                )
            )
        )
    }

    fun getInitialDefaults(): List<PrayerItem> {
        return listOf(
            PrayerItem(
                id = "doa_1",
                title = "1. Doa Kurab (Menghadapi Kesulitan & Duka)",
                mainCategory = "Doa Harian",
                subCategory = "Kesulitan",
                description = "Doa yang dibaca Rasulullah SAW saat menghadapi kesulitan besar atau duka mendalam.",
                verses = listOf(
                    Verse(1, "لاَ إِلَهَ إِلاَّ اللَّهُ الْعَظِيمُ الْحَلِيمُ", "Laa ilaaha illallaahul-'azhiimul-haliim.", "Tidak ada Tuhan selain Allah Yang Maha Agung lagi Maha Penyantun."),
                    Verse(2, "لاَ إِلَهَ إِلاَّ اللَّهُ رَبُّ العَرْشِ العَظِيمِ", "Laa ilaaha illallaahu rabbul-'arsyil-'azhiim.", "Tidak ada Tuhan selain Allah, Tuhan Pemilik 'Arsy yang agung."),
                    Verse(3, "لاَ إِلَهَ إِلاَّ اللَّهُ رَبُّ السَّمَاوَاتِ وَرَبُّ الأَرْضِ وَرَبُّ العَرْشِ الكَرِيمِ", "Laa ilaaha illallaahu rabbus-samaawaati wa rabbul-ardhi wa rabbul-'arsyil-kariim.", "Tidak ada Tuhan selain Allah, Tuhan pemelihara langit dan bumi, dan Tuhan Pemilik 'Arsy yang mulia.")
                )
            ),
            PrayerItem(
                id = "doa_2",
                title = "2. Doa Kedua Orang Tua",
                mainCategory = "Doa Harian",
                subCategory = "Keluarga",
                description = "Doa memohon ampunan dan rahmat untuk ayah dan ibu.",
                verses = listOf(
                    Verse(1, "رَبِّ اغْفِرْ لِي وَلِوَالِدَيَّ وَارْحَمْهُمَا كَمَا رَبَّيَانِي صَغِيرًا", "Rabbighfir lii wa liwaalidayya warhamhumaa kamaa rabbayaanii shaghiiraa.", "Ya Tuhanku, ampunilah aku dan kedua orang tuaku, dan kasihanilah keduanya sebagaimana mereka mendidikku sewaktu kecil.")
                )
            ),
            PrayerItem(
                id = "doa_3",
                title = "3. Doa Sapu Jagat (Kebaikan Dunia & Akhirat)",
                mainCategory = "Doa Harian",
                subCategory = "Permohonan",
                description = "Doa paling sering dibaca untuk memohon kebaikan dunia, akhirat, dan perlindungan dari neraka.",
                verses = listOf(
                    Verse(1, "رَبَّنَا آتِنَا فِي الدُّنْيَا حَسَنَةً وَفِي الآخِرَةِ حَسَنَةً وَقِنَا عَذَابَ النَّارِ", "Rabbanaa aatinaa fid-dunyaa hasanataw-wa fil-aakhirati hasanataw-wa qinaa 'adzaaban-naar.", "Ya Tuhan kami, berilah kami kebaikan di dunia dan kebaikan di akhirat dan lindungilah kami dari azab neraka.")
                )
            ),
            PrayerItem(
                id = "doa_4",
                title = "4. Doa Keteguhan Iman",
                mainCategory = "Doa Harian",
                subCategory = "Permohonan",
                description = "Doa agar hati tidak berpaling dari jalan kebenaran (QS. Ali 'Imran: 8).",
                verses = listOf(
                    Verse(1, "رَبَّنَا لاَ تُزِغْ قُلُوبَنَا بَعْدَ إِذْ هَدَيْتَنَا وَهَبْ لَنَا مِنْ لَدُنْكَ رَحْمَةً إِنَّكَ أَنْتَ الْوَهَّابُ", "Rabbanaa laa tuzigh quluubanaa ba'da idz hadaitanaa wa hab lanaa mil-ladunka rahmatan innaka antal-wahhaab.", "Ya Tuhan kami, janganlah Engkau jadikan hati kami cenderung kepada kesesatan sesudah Engkau beri petunjuk kepada kami, dan karuniakanlah kepada kami rahmat dari sisi-Mu; karena sesungguhnya Engkau-lah Maha Pemberi (karunia).")
                )
            ),
            PrayerItem(
                id = "doa_5",
                title = "5. Doa Ashabul Kahfi",
                mainCategory = "Doa Harian",
                subCategory = "Kesulitan",
                description = "Doa memohon rahmat dan petunjuk dalam menghadapi ujian (QS. Al-Kahf: 10).",
                verses = listOf(
                    Verse(1, "رَبَّنَا آتِنَا مِنْ لَدُنْكَ رَحْمَةً وَهَيِّئْ لَنَا مِنْ أَمْرِنَا رَشَدًا", "Rabbanaa aatinaa mil-ladunka rahmataw-wa hayyi' lanaa min amrinaa rasyadaa.", "Ya Tuhan kami, berikanlah rahmat kepada kami dari sisi-Mu dan sempurnakanlah bagi kami petunjuk yang lurus dalam urusan kami.")
                )
            ),
            PrayerItem(
                id = "doa_6",
                title = "6. Doa Lailatul Qadar",
                mainCategory = "Doa Harian",
                subCategory = "Permohonan",
                description = "Doa yang diajarkan Nabi SAW kepada Aisyah RA untuk dibaca pada malam Lailatul Qadar.",
                verses = listOf(
                    Verse(1, "اللَّهُمَّ إِنَّكَ عَفُوٌّ تُحِبُّ الْعَفْوَ فَاعْفُ عَنِّي", "Allaahumma innaka 'afuwwun tuhibbul-'afwa fa'fu 'annii.", "Ya Allah, sesungguhnya Engkau Maha Pemaaf dan menyukai maaf, maka maafkanlah aku.")
                )
            ),
            PrayerItem(
                id = "doa_7",
                title = "7. Doa Kebaikan Keluarga & Keturunan",
                mainCategory = "Doa Harian",
                subCategory = "Keluarga",
                description = "Doa agar dianugerahi istri dan keturunan sebagai penenang hati (QS. Al-Furqan: 74).",
                verses = listOf(
                    Verse(1, "رَبَّنَا هَبْ لَنَا مِنْ أَزْوَاجِنَا وَذُرِّيَّاتِنَا قُرَّةَ أَعْيُنٍ وَاجْعَلْنَا لِلْمُتَّقِينَ إِمَامًا", "Rabbanaa hab lanaa min azwaajinaa wa dzurriyyaatinaa qurrata a'yuniw-waj'alnaa lil-muttaqiina imaamaa.", "Ya Tuhan kami, anugerahkanlah kepada kami istri-istri kami dan keturunan kami sebagai penyenang hati (kami), dan jadikanlah kami imam bagi orang-orang yang bertakwa.")
                )
            ),
            PrayerItem(
                id = "doa_8",
                title = "8. Doa Sebelum & Sesudah Makan",
                mainCategory = "Doa Harian",
                subCategory = "Pakaian & Makan",
                description = "Doa rasa syukur atas rezeki makanan dan minuman.",
                verses = listOf(
                    Verse(1, "اللَّهُمَّ بَارِكْ لَنَا فِيمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ", "Allaahumma baarik lanaa fiimaa razaqtanaa wa qinaa 'adzaaban-naar.", "Ya Allah, berkahilah kami dalam rezeki yang telah Engkau berikan kepada kami dan peliharalah kami dari azab neraka."),
                    Verse(2, "الْحَمْدُ لِلَّهِ الَّذِي أَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِينَ", "Al-hamdu lillaahilladzii at'amanaa wa saqaanaa wa ja'alanaa muslimiin.", "Segala puji bagi Allah yang telah memberi kami makan dan minum serta menjadikan kami termasuk orang-orang muslim.")
                )
            ),
            PrayerItem(
                id = "doa_9",
                title = "9. Doa Sebelum & Bangun Tidur",
                mainCategory = "Doa Harian",
                subCategory = "Pagi & Petang",
                description = "Doa penyerahan diri sebelum tidur dan ucapan syukur saat terbangun.",
                verses = listOf(
                    Verse(1, "بِاسْمِكَ اللَّهُمَّ أَحْيَا وَبِاسْمِكَ أَمُوتُ", "Bismikallaahumma ahyaa wa bismika amuut.", "Dengan nama-Mu ya Allah aku hidup dan dengan nama-Mu aku mati."),
                    Verse(2, "الْحَمْدُ لِلَّهِ الَّذِي أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُورُ", "Al-hamdu lillaahilladzii ahyaanaa ba'da maa amaatanaa wa ilaihin-nusyuur.", "Segala puji bagi Allah yang telah menghidupkan kami kembali setelah mematikan kami, dan hanya kepada-Nya kami dibangkitkan.")
                )
            ),
            PrayerItem(
                id = "doa_10",
                title = "10. Doa Masuk & Keluar Masjid",
                mainCategory = "Doa Harian",
                subCategory = "Ibadah",
                description = "Doa memohon pintu rahmat dan keutamaan dari Allah.",
                verses = listOf(
                    Verse(1, "اللَّهُمَّ افْتَحْ لِي أَبْوَابَ رَحْمَتِكَ", "Allaahummaftah lii abwaaba rahmatik.", "Ya Allah, bukakanlah untukku pintu-pintu rahmat-Mu."),
                    Verse(2, "اللَّهُمَّ إِنِّي أَسْأَلُكَ مِنْ فَضْلِكَ", "Allaahumma innii as'aluka min fadhlik.", "Ya Allah, sesungguhnya aku memohon keutamaan dari-Mu.")
                )
            ),
            PrayerItem(
                id = "doa_11",
                title = "11. Doa Masuk & Keluar Kamar Mandi",
                mainCategory = "Doa Harian",
                subCategory = "Perlindungan",
                description = "Doa perlindungan dari gangguan setan laki-laki dan setan perempuan.",
                verses = listOf(
                    Verse(1, "اللَّهُمَّ إِنِّي أَعُوذُ بِكَ مِنَ الْخُبُثِ وَالْخَبَائِثِ", "Allaahumma innii a'uudzu bika minal-khubutsi wal-khabaa'its.", "Ya Allah, sesungguhnya aku berlindung kepada-Mu dari godaan setan laki-laki dan setan perempuan."),
                    Verse(2, "غُفْرَانَكَ ، الْحَمْدُ لِلَّهِ الَّذِي أَذْهَبَ عَنِّي الأَذَى وَعَافَانِي", "Ghufraanaka, al-hamdu lillaahilladzii adzhaba 'annil-adzaa wa 'aafanii.", "Aku memohon ampunan-Mu. Segala puji bagi Allah yang telah menghilangkan kotoran dari badanku dan menyihatkanku.")
                )
            ),
            PrayerItem(
                id = "doa_12",
                title = "12. Doa Berpakaian & Melepas Pakaian",
                mainCategory = "Doa Harian",
                subCategory = "Pakaian & Makan",
                description = "Doa memohon kebaikan dari pakaian yang dikenakan.",
                verses = listOf(
                    Verse(1, "الْحَمْدُ لِلَّهِ الَّذِي كَسَانِي هَذَا الثَّوْبَ وَرَزَقَنِيهِ مِنْ غَيْرِ حَوْلٍ مِنِّي وَلاَ قُوَّةٍ", "Al-hamdu lillaahilladzii kasaanii hadzat-tsauba wa razaqaniihi min ghairi haulin minnii wa laa quwwah.", "Segala puji bagi Allah yang telah memakaikan pakaian ini kepadaku dan memberi rezeki pakaian ini tanpa daya dan kekuatan dariku.")
                )
            ),
            PrayerItem(
                id = "doa_13",
                title = "13. Doa Keluar Rumah & Bepergian",
                mainCategory = "Doa Harian",
                subCategory = "Perlindungan",
                description = "Doa bertawakal kepada Allah saat melangkahkan kaki keluar rumah.",
                verses = listOf(
                    Verse(1, "بِسْمِ اللَّهِ تَوَكَّلْتُ عَلَى اللَّهِ لاَ حَوْلَ وَلاَ قُوَّةَ إِلاَّ بِاللَّهِ", "Bismillaahi tawakkaltu 'alallaahi laa haula wa laa quwwata illaa billaah.", "Dengan nama Allah, aku bertawakal kepada Allah, tidak ada daya dan kekuatan kecuali dengan pertolongan Allah.")
                )
            ),
            PrayerItem(
                id = "doa_14",
                title = "14. Doa Naik Kendaraan",
                mainCategory = "Doa Harian",
                subCategory = "Perlindungan",
                description = "Doa memohon keselamatan saat menaiki kendaraan (QS. Az-Zukhruf: 13-14).",
                verses = listOf(
                    Verse(1, "سُبْحَانَ الَّذِي سَخَّرَ لَنَا هَذَا وَمَا كُنَّا لَهُ مُقْرِنِينَ وَإِنَّا إِلَى رَبِّنَا لَمُنْقَلِبُونَ", "Subhaanalladzii sakhkhara lanaa hadzaa wa maa kunnaa lahu muqriniin, wa innaa ilaa rabbinaa lamunqalibuun.", "Maha Suci Tuhan yang telah menundukkan semua ini bagi kami padahal kami sebelumnya tidak mampu menguasainya, dan sesungguhnya kami akan kembali kepada Tuhan kami.")
                )
            ),
            PrayerItem(
                id = "doa_15",
                title = "15. Doa Memohon Ilmu & Rezeki Halal",
                mainCategory = "Doa Harian",
                subCategory = "Permohonan",
                description = "Doa yang rutin dibaca setiap pagi setelah shalat Subuh.",
                verses = listOf(
                    Verse(1, "اللَّهُمَّ إِنِّي أَسْأَلُكَ عِلْمًا نَافِعًا وَرِزْقًا طَيِّبًا وَعَمَلاً مُتَقَبَّلاً", "Allaahumma innii as'aluka 'ilman naafi'aw-wa rizqan thayyibaw-wa 'amalam-mutaqabbalaa.", "Ya Allah, sesungguhnya aku memohon kepada-Mu ilmu yang bermanfaat, rezeki yang halal dan baik, serta amal yang diterima.")
                )
            ),
            PrayerItem(
                id = "doa_16",
                title = "16. Doa Ketika Hujan",
                mainCategory = "Doa Harian",
                subCategory = "Permohonan",
                description = "Doa memohon agar hujan membawa keberkahan.",
                verses = listOf(
                    Verse(1, "اللَّهُمَّ صَيِّبًا نَافِعًا", "Allaahumma shayyiban naafi'aa.", "Ya Allah, turunkanlah hujan yang bermanfaat.")
                )
            ),
            PrayerItem(
                id = "doa_17",
                title = "17. Doa Setelah Azan",
                mainCategory = "Doa Harian",
                subCategory = "Ibadah",
                description = "Doa memohon Wasilah dan keutamaan bagi Rasulullah SAW.",
                verses = listOf(
                    Verse(1, "اللَّهُمَّ رَبَّ هَذِهِ الدَّعْوَةِ التَّامَّةِ وَالصَّلاَةِ الْقَائِمَةِ آتِ مُحَمَّدًا الْوَسِيلَةَ وَالْفَضِيلَةَ وَابْعَثْهُ مَقَامًا مَحْمُودًا الَّذِي وَعَدْتَهُ", "Allaahumma rabba hadzihid-da'watit-taammati was-shalaatil-qaa'imati aati muhammadanil-wasiilata wal-fadhiilata wab'atshu maqaamam-mahmuudanilladzii wa'adtah.", "Ya Allah, Tuhan Pemilik panggilan yang sempurna ini dan shalat yang didirikan, berilah Muhammad wasilah dan keutamaan, serta bangkitkanlah beliau pada tempat terpuji yang telah Engkau janjikan.")
                )
            ),
            PrayerItem(
                id = "doa_18",
                title = "18. Doa Sebelum & Sesudah Wudhu",
                mainCategory = "Doa Harian",
                subCategory = "Ibadah",
                description = "Doa kesucian saat bersuci.",
                verses = listOf(
                    Verse(1, "أَشْهَدُ أَنْ لاَ إِلَهَ إِلاَّ اللَّهُ وَحْدَهُ لاَ شَرِيكَ لَهُ وَأَشْهَدُ أَنَّ مُحَمَّدًا عَبْدُهُ وَرَسُولُهُ", "Asyhadu allaa ilaaha illallaahu wahdahu laa syariika lahu wa asyhadu anna muhammadan 'abduhu wa rasuuluh.", "Aku bersaksi bahwa tidak ada Tuhan selain Allah Yang Maha Esa, tidak ada sekutu bagi-Nya, dan aku bersaksi bahwa Muhammad adalah hamba dan utusan-Nya."),
                    Verse(2, "اللَّهُمَّ اجْعَلْنِي مِنَ التَّوَّابِينَ وَاجْعَلْنِي مِنَ الْمُتَطَهِّرِينَ", "Allaahummaj'alnii minat-tawwaabiina waj'alnii minal-mutathahhiriin.", "Ya Allah, jadikanlah aku termasuk orang-orang yang bertaubat dan jadikanlah aku termasuk orang-orang yang bersuci.")
                )
            ),
            PrayerItem(
                id = "doa_19",
                title = "19. Doa Menjenguk Orang Sakit",
                mainCategory = "Doa Harian",
                subCategory = "Permohonan",
                description = "Doa memohon kesembuhan bagi kerabat yang sedang sakit.",
                verses = listOf(
                    Verse(1, "اللَّهُمَّ رَبَّ النَّاسِ أَذْهِبِ الْبَأْسَ اشْفِ أَنْتَ الشَّافِي لاَ شِفَاءَ إِلاَّ شِفَاؤُكَ شِفَاءً لاَ يُغَادِرُ سَقَمًا", "Allaahumma rabban-naasi adzhibil-ba'sasyfi antas-syaafii laa syifaa'a illaa syifaa'uka syifaa'al-laa yughaadiru saqamaa.", "Ya Allah, Tuhan seluruh manusia, hilangkanlah penyakit ini, sembuhkanlah karena Engkau-lah Yang Maha Menyembuhkan, tidak ada kesembuhan kecuali kesembuhan dari-Mu, kesembuhan yang tidak meninggalkan rasa sakit.")
                )
            ),
            PrayerItem(
                id = "doa_20",
                title = "20. Doa Belasungkawa / Takziah",
                mainCategory = "Doa Harian",
                subCategory = "Kesulitan",
                description = "Doa penghibur bagi keluarga yang tertimpa musibah duka.",
                verses = listOf(
                    Verse(1, "إِنَّ لِلَّهِ مَا أَخَذَ وَلَهُ مَا أَعْطَى وَكُلٌّ عِنْدَهُ بِأَجَلٍ مُسَمًّى فَلْتَصْبِرْ وَلْتَحْتَسِبْ", "Inna lillaahi maa akhadza wa lahu maa a'thaa wa kullun 'indahu bi-ajalim-musammaa faltasbir waltahtasib.", "Sesungguhnya milik Allah lah apa yang Dia ambil dan milik-Nya lah apa yang Dia berikan, dan segala sesuatu di sisi-Nya memiliki jangka waktu yang telah ditentukan, maka bersabarlah dan harapkanlah pahala.")
                )
            ),
            PrayerItem(
                id = "doa_21",
                title = "21. Doa Sujud Tilawah",
                mainCategory = "Doa Harian",
                subCategory = "Ibadah",
                description = "Dibaca ketika membaca atau mendengar ayat sajdah dalam Al-Qur'an.",
                verses = listOf(
                    Verse(1, "سَجَدَ وَجْهِيَ لِلَّذِي خَلَقَهُ وَشَقَّ سَمْعَهُ وَبَصَرَهُ بِحَوْلِهِ وَقُوَّتِهِ فَتَبَارَكَ اللَّهُ أَحْسَنُ الْخَالِقِينَ", "Sajada wajhiya lilladzii khalaqahu wa syaqqa sam'ahu wa basharahu bihaulihi wa quwwatih fa tabaarakallaahu ahsanul-khaaliqiin.", "Wajahku bersujud kepada Zat yang menciptakannya dan membukakan pendengaran serta penglihatannya dengan daya dan kekuatan-Nya, maka Maha Suci Allah Pencipta yang paling baik.")
                )
            ),
            PrayerItem(
                id = "doa_22",
                title = "22. Doa Kafaratul Majlis",
                mainCategory = "Doa Harian",
                subCategory = "Pagi & Petang",
                description = "Doa penutup setiap perkumpulan atau majelis agar diampuni kekhilafan kata.",
                verses = listOf(
                    Verse(1, "سُبْحَانَكَ اللَّهُمَّ وَبِحَمْدِكَ أَشْهَدُ أَنْ لاَ إِلَهَ إِلاَّ أَنْتَ أَسْتَغْفِرُكَ وَأَتُوبُ إِلَيْكَ", "Subhaanakallaahumma wa bihamdika asyhadu allaa ilaaha illaa anta astaghfiruka wa atuubu ilaik.", "Maha Suci Engkau ya Allah dan dengan memuji-Mu, aku bersaksi bahwa tidak ada Tuhan selain Engkau, aku memohon ampunan-Mu dan bertaubat kepada-Mu.")
                )
            ),
            PrayerItem(
                id = "doa_23",
                title = "23. Doa Memohon Ampunan & Rahmat",
                mainCategory = "Doa Harian",
                subCategory = "Permohonan",
                description = "Doa pengampunan dosa yang mencakup seluruh kesalahan (QS. Al-Mu'minun: 118).",
                verses = listOf(
                    Verse(1, "رَبِّ اغْفِرْ وَارْحَمْ وَأَنْتَ خَيْرُ الرَّاحِمِينَ", "Rabbighfir warham wa anta khairur-raahimiin.", "Ya Tuhanku ampunilah dan berilah rahmat, dan Engkau adalah Pemberi rahmat Yang Paling Baik.")
                )
            )
        )
    }

    fun getDzikirDefaults(): List<PrayerItem> {
        return listOf(
            PrayerItem(
                id = "dzikir_1",
                title = "1. Ayat Kursi (Surah Al-Baqarah: 255)",
                mainCategory = "Dzikir Pagi & Sore",
                subCategory = "Pagi & Petang",
                description = "Dibaca 1x pagi dan sore untuk perlindungan mutlak dari gangguan setan.",
                verses = listOf(
                    Verse(1, "اللَّهُ لَا إِلَٰهَ إِلَّا هُوَ الْحَيُّ الْقَيُّومُ ۚ لَا تَأْخُذُهُ سِنَةٌ وَلَا نَوْمٌ ۚ لَّهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ", "Allaahu laa ilaaha illaa huwal-hayyul-qayyuum, laa ta'khudzuhu sinatuw-wa laa naum, lahu maa fis-samaawaati wa maa fil-ardh.", "Allah, tidak ada Tuhan (yang berhak disembah) melainkan Dia Yang Hidup kekal lagi terus menerus mengurus (makhluk-Nya); tidak mengantuk dan tidak tidur. Kepunyaan-Nya apa yang di langit dan di bumi."),
                    Verse(2, "مَن ذَا الَّذِي يَشْفَعُ عِندَهُ إِلَّا بِإِذْنِهِ ۚ يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ ۖ وَلَا يُحِيطُونَ بِشَيْءٍ مِّنْ عِلْمِهِ إِلَّا بِمَا شَاءَ", "Man dzalladzii yasyfa'u 'indahu illaa bi idznih, ya'lamu maa baina aidiihim wa maa khalfahum, wa laa yuhiithuuna bi syai'im-min 'ilmihi illaa bimaa syaa'.", "Tiada yang dapat memberi syafaat di sisi Allah tanpa izin-Nya? Allah mengetahui apa-apa yang di hadapan mereka dan di belakang mereka, dan mereka tidak mengetahui apa-apa dari ilmu Allah melainkan apa yang dikehendaki-Nya."),
                    Verse(3, "وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ ۖ وَلَا يَئُودُهُ حِفْظُهُمَا ۚ وَهُوَ الْعَلِيُّ الْعَظِيمُ", "Wasi'a kursiyyuhus-samaawaati wal-ardh, wa laa ya'uuduhu hifzhuhumaa wa huwal-'aliyyul-'azhiim.", "Kursi Allah meliputi langit dan bumi. Dan Allah tidak merasa berat memelihara keduanya, dan Allah Maha Tinggi lagi Maha Besar.")
                ),
                targetCount = 1
            ),
            PrayerItem(
                id = "dzikir_2",
                title = "2. Surah Al-Ikhlas, Al-Falaq, An-Naas (3x)",
                mainCategory = "Dzikir Pagi & Sore",
                subCategory = "Pagi & Petang",
                description = "Dibaca masing-masing 3 kali pada pagi dan petang hari.",
                verses = listOf(
                    Verse(1, "قُلْ هُوَ اللَّهُ أَحَدٌ ﴿١﴾ اللَّهُ الصَّمَدُ ﴿٢﴾ لَمْ يَلِدْ وَلَمْ يُولَدْ ﴿٣﴾ وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌ ﴿٤﴾", "Qul huwallaahu ahad. Allaahus-shamad. Lam yalid wa lam yuulad. Wa lam yakul-lahu kufuwan ahad.", "Surah Al-Ikhlas (3x) - Ketauhidan dan keikhlasan."),
                    Verse(2, "قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ ﴿١﴾ مِن شَرِّ مَا خَلَقَ ﴿٢﴾ وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ ﴿٣﴾ وَمِن شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ ﴿٤﴾ وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ ﴿٥﴾", "Qul a'uudzu birabbil-falaq...", "Surah Al-Falaq (3x) - Perlindungan dari kejahatan makhluk."),
                    Verse(3, "قُلْ أَعُوذُ بِرَبِّ النَّاسِ ﴿١﴾ مَلِكِ النَّاسِ ﴿٢﴾ إِلَٰهِ النَّاسِ ﴿٣﴾ مِن شَرِّ الْوَسْوَاسِ الْخَنَّاسِ ﴿٤﴾ الَّذِي يُوَسْوِسُ فِي صُدُورِ النَّاسِ ﴿٥﴾ مِنَ الْجِنَّةِ وَالنَّاسِ ﴿٦﴾", "Qul a'uudzu birabbin-naas...", "Surah An-Naas (3x) - Perlindungan dari bisikan setan.")
                ),
                targetCount = 3
            ),
            PrayerItem(
                id = "dzikir_3",
                title = "3. Sayyidul Istighfar",
                mainCategory = "Dzikir Pagi & Sore",
                subCategory = "Pagi & Petang",
                description = "Rajanya Istighfar. Barangsiapa membacanya di sore hari lalu meninggal malamnya, ia masuk surga.",
                verses = listOf(
                    Verse(1, "اللَّهُمَّ أَنْتَ رَبِّي لاَ إِلَهَ إِلاَّ أَنْتَ خَلَقْتَنِي وَأَنَا عَبْدُكَ وَأَنَا عَلَى عَهْدِكَ وَوَعْدِكَ مَا اسْتَطَعْتُ", "Allaahumma anta rabbii laa ilaaha illaa anta khalaqtanii wa ana 'abduka wa ana 'alaa 'ahdika wa wa'dika mastatha'tu.", "Ya Allah, Engkau adalah Tuhanku, tidak ada Tuhan selain Engkau. Engkau yang menciptakanku dan aku adalah hamba-Mu, aku menggantungkan janjiku kepada-Mu sebisa mampuku."),
                    Verse(2, "أَعُوذُ بِكَ مِنْ شَرِّ مَا صَنَعْتُ أَبُوءُ لَكَ بِنِعْمَتِكَ عَلَيَّ وَأَبُوءُ بِذَنْبِي فَاغْفِرْ لِي فَإِنَّهُ لاَ يَغْفِرُ الذُّنُوبَ إِلاَّ أَنْتَ", "A'uudzu bika min syarri maa shana'tu abu'u laka bini'matika 'alayya wa abu'u bidzanbii faghfir lii fa innahu laa yaghfirudz-dzunuuba illaa anta.", "Aku berlindung kepada-Mu dari keburukan apa yang kuperbuat. Aku mengakui nikmat-Mu kepadaku dan aku mengakui dosaku, maka ampunilah aku karena tidak ada yang mengampuni dosa selain Engkau.")
                ),
                targetCount = 1
            ),
            PrayerItem(
                id = "dzikir_4",
                title = "4. Doa 'Afiyah (Keselamatan)",
                mainCategory = "Dzikir Pagi & Sore",
                subCategory = "Perlindungan",
                description = "Doa memohon keselamatan jasmani, rohani, dan perlindungan dari 6 arah.",
                verses = listOf(
                    Verse(1, "اللَّهُمَّ إِنِّي أَسْأَلُكَ الْعَافِيَةَ فِي الدُّنْيَا وَالآخِرَةِ", "Allaahumma innii as'alukal-'aafiyata fid-dunyaa wal-aakhirah.", "Ya Allah, sesungguhnya aku memohon keselamatan di dunia dan akhirat."),
                    Verse(2, "اللَّهُمَّ احْفَظْنِي مِنْ بَيْنِ يَدَيَّ وَمِنْ خَلْفِي وَعَنْ يَمِينِي وَعَنْ شِمَالِي وَمِنْ فَوْقِي وَأَعُوذُ بِعَظَمَتِكَ أَنْ أُغْتَالَ مِنْ تَحْتِي", "Allaahummahfazhnii min baini yadayya wa min khalfii wa 'an yamiinii wa 'an syimaalii wa min fauqii wa a'uudzu bi 'azhamatika an ughtaala min tahtii.", "Ya Allah peliharalah aku dari depan, belakang, kanan, kiri, atas, dan aku berlindung dengan keagungan-Mu dari dijerumuskan dari bawahku.")
                ),
                targetCount = 1
            ),
            PrayerItem(
                id = "dzikir_5",
                title = "5. Doa Perlindungan dari Syirik",
                mainCategory = "Dzikir Pagi & Sore",
                subCategory = "Perlindungan",
                description = "Memohon pemeliharaan aqidah dari perbuatan syirik besar maupun kecil.",
                verses = listOf(
                    Verse(1, "اللَّهُمَّ إِنِّي أَعُوذُ بِكَ أَنْ أُشْرِكَ بِكَ وَأَنَا أَعْلَمُ وَأَسْتَغْفِرُكَ لِمَا لاَ أَعْلَمُ", "Allaahumma innii a'uudzu bika an usyrika bika wa ana a'lamu wa astaghfiruka limaa laa a'lam.", "Ya Allah, sesungguhnya aku berlindung kepada-Mu dari mempersekutukan-Mu sedangkan aku mengetahuinya, dan aku memohon ampunan-Mu atas apa yang tidak kuketahui.")
                ),
                targetCount = 1
            ),
            PrayerItem(
                id = "dzikir_6",
                title = "6. Tasbih & Tahlil (100x)",
                mainCategory = "Dzikir Pagi & Sore",
                subCategory = "Pagi & Petang",
                description = "Kalimat tauhid yang dibaca 100 kali sehari untuk penggugur dosa.",
                verses = listOf(
                    Verse(1, "لاَ إِلَهَ إِلاَّ اللَّهُ وَحْدَهُ لاَ شَرِيكَ لَهُ لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَىْءٍ قَدِيرٌ", "Laa ilaaha illallaahu wahdahu laa syariika lahu lahul-mulku wa lahul-hamdu wa huwa 'alaa kulli syai'in qadiir. (100x)", "Tidak ada Tuhan selain Allah Yang Maha Esa, tidak ada sekutu bagi-Nya, bagi-Nya kerajaan dan puji-pujian, dan Dia Maha Kuasa atas segala sesuatu.")
                ),
                targetCount = 100
            ),
            PrayerItem(
                id = "dzikir_7",
                title = "7. Perlindungan Bahaya (Bismillahilladhi)",
                mainCategory = "Dzikir Pagi & Sore",
                subCategory = "Perlindungan",
                description = "Dibaca 3x pagi dan sore, tidak ada sesuatu pun di bumi dan langit yang dapat memudaratkan.",
                verses = listOf(
                    Verse(1, "بِسْمِ اللَّهِ الَّذِي لاَ يَضُرُّ مَعَ اسْمِهِ شَىْءٌ فِي الأَرْضِ وَلاَ فِي السَّمَاءِ وَهُوَ السَّمِيعُ الْعَلِيمُ", "Bismillaahilladzii laa yadhurru ma'asmihi syai'un fil-ardhi wa laa fis-samaa'i wa huwas-samii'ul-'aliim. (3x)", "Dengan nama Allah yang tidak ada sesuatupun di bumi maupun di langit yang dapat memudaratkan bersama nama-Nya, dan Dia Maha Mendengar lagi Maha Mengetahui.")
                ),
                targetCount = 3
            ),
            PrayerItem(
                id = "dzikir_8",
                title = "8. Radhitu Billahi Rabba (3x)",
                mainCategory = "Dzikir Pagi & Sore",
                subCategory = "Pagi & Petang",
                description = "Barangsiapa membacanya 3x pagi dan sore, Allah wajib meridhai dirinya di hari kiamat.",
                verses = listOf(
                    Verse(1, "رَضِيتُ بِاللَّهِ رَبًّا وَبِالإِسْلاَمِ دِينًا وَبِمُحَمَّدٍ صَلَّى اللَّهُ عَلَيْهِ وَسَلَّمَ نَبِيًّا", "Radhiitu billaahi rabbaw-wa bil-islaami diinaw-wa bi muhammadin shallallaahu 'alaihi wa sallama nabiyyaa. (3x)", "Aku ridha Allah sebagai Tuhanku, Islam sebagai agamaku, dan Muhammad SAW sebagai Nabiku.")
                ),
                targetCount = 3
            ),
            PrayerItem(
                id = "dzikir_9",
                title = "9. Ya Hayyu Ya Qayyum",
                mainCategory = "Dzikir Pagi & Sore",
                subCategory = "Permohonan",
                description = "Doa memohon pertolongan dan perbaikan seluruh urusan hidup.",
                verses = listOf(
                    Verse(1, "يَا حَيُّ يَا قَيُّومُ بِرَحْمَتِكَ أَسْتَغِيثُ أَصْلِحْ لِي شَأْنِي كُلَّهُ وَلاَ تَكِلْنِي إِلَى نَفْسِي طَرْفَةَ عَيْنٍ", "Yaa hayyu yaa qayyuumu bi rahmatika astaghiitsu aslih lii sya'nii kullahu wa laa takilnii ilaa nafsii tharfata 'ain.", "Wahai Zat Yang Maha Hidup lagi Maha Berdiri Sendiri, dengan rahmat-Mu aku memohon pertolongan. Perbaikilah seluruh urusanku dan janganlah Engkau serahkan aku kepada diriku sendiri walau sekejap mata pun.")
                ),
                targetCount = 1
            ),
            PrayerItem(
                id = "dzikir_10",
                title = "10. Subhanallahi wa Bihamdihi (100x)",
                mainCategory = "Dzikir Pagi & Sore",
                subCategory = "Pagi & Petang",
                description = "Dibaca 100x. Diampuni dosa-dosanya meskipun sebanyak buih di lautan.",
                verses = listOf(
                    Verse(1, "سُبْحَانَ اللَّهِ وَبِحَمْدِهِ ، سُبْحَانَ اللَّهِ الْعَظِيمِ", "Subhaanallaahi wa bihamdih, subhaanallaahil-'azhiim. (100x)", "Maha Suci Allah dan dengan memuji-Nya, Maha Suci Allah Yang Maha Agung.")
                ),
                targetCount = 100
            )
        )
    }

    fun getSunnahDefaults(): List<PrayerItem> {
        return listOf(
            PrayerItem(
                id = "sunnah_1",
                title = "Adab Bangun Tidur",
                mainCategory = "Sunnah Sehari-hari",
                subCategory = "Pagi & Petang",
                description = "Sunnah saat terbangun dari tidur.",
                verses = listOf(
                    Verse(1, "الْحَمْدُ لِلَّهِ الَّذِي أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُورُ", "Mengusap wajah, membaca doa bangun tidur, bersiwak / menggosok gigi, dan mencuci kedua tangan sebelum dimasukkan ke dalam bejana.", "Sunnah: Segera mengingat Allah, mencuci tangan 3x, bersiwak, dan berwudhu.")
                )
            ),
            PrayerItem(
                id = "sunnah_2",
                title = "Adab Berwudhu & Bersuci",
                mainCategory = "Sunnah Sehari-hari",
                subCategory = "Ibadah",
                description = "Tata cara dan sunnah bersuci secara sempurna.",
                verses = listOf(
                    Verse(1, "بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ", "Membaca Bismillah, berkumur dan memasukkan air ke hidung (Istinsyaq), menyela-nyela jemari dan jenggot, mendahulukan anggota kanan.", "Sunnah: Hemat air, mengulangi 3 kali pencucian, dan berdoa setelah selesai wudhu.")
                )
            ),
            PrayerItem(
                id = "sunnah_3",
                title = "Adab Berpakaian & Berhias",
                mainCategory = "Sunnah Sehari-hari",
                subCategory = "Pakaian & Makan",
                description = "Adab islami dalam mengenakan pakaian dan perhiasan.",
                verses = listOf(
                    Verse(1, "اللَّهُمَّ لَكَ الْحَمْدُ أَنْتَ كَسَوْتَنِيهِ", "Mulai dari sebelah kanan saat memakai dan sebelah kiri saat melepas, membaca bismillah/doa berpakaian, serta memilih pakaian yang bersih dan sopan.", "Sunnah: Menghindari pakaian syuhrah (pamer) dan menjaga kerapian.")
                )
            ),
            PrayerItem(
                id = "sunnah_4",
                title = "Adab Keluar Rumah & Di Jalan",
                mainCategory = "Sunnah Sehari-hari",
                subCategory = "Perlindungan",
                description = "Adab tatkala melangkah ke luar rumah.",
                verses = listOf(
                    Verse(1, "بِسْمِ اللَّهِ تَوَكَّلْتُ عَلَى اللَّهِ", "Melangkah dengan kaki kanan, membaca doa keluar rumah, menundukkan pandangan (Ghadul Bashar), dan menebarkan salam.", "Sunnah: Berjalan dengan tenang dan memberikan hak jalanan.")
                )
            ),
            PrayerItem(
                id = "sunnah_5",
                title = "Adab Makan & Minum",
                mainCategory = "Sunnah Sehari-hari",
                subCategory = "Pakaian & Makan",
                description = "Adab rasulullah SAW saat makan dan minum.",
                verses = listOf(
                    Verse(1, "بِسْمِ اللَّهِ وَعَلَى بَرَكَةِ اللَّهِ", "Mencuci tangan, membaca Bismillah, makan menggunakan tangan kanan, mengambil makanan yang terdekat, dan minum sambil duduk dalam 3 tegukan.", "Sunnah: Tidak mencela makanan, tidak makan berlebihan (1/3 makanan, 1/3 minuman, 1/3 nafas).")
                )
            ),
            PrayerItem(
                id = "sunnah_6",
                title = "Adab Berbicara & Menjaga Lisan",
                mainCategory = "Sunnah Sehari-hari",
                subCategory = "Permohonan",
                description = "Adab komunikasi dan persahabatan.",
                verses = listOf(
                    Verse(1, "مَنْ كَانَ يُؤْمِنُ بِاللَّهِ وَالْيَوْمِ الآخِرِ فَلْيَقُلْ خَيْرًا أَوْ لِيَصْمُتْ", "Man kaana yu'minu billaahi wal-yaumil-aakhiri fal-yaqul khairan au liyashmut.", "Barangsiapa beriman kepada Allah dan hari akhir, hendaklah ia berkata baik atau diam.")
                )
            ),
            PrayerItem(
                id = "sunnah_7",
                title = "Adab Bertamu & Menerima Tamu",
                mainCategory = "Sunnah Sehari-hari",
                subCategory = "Keluarga",
                description = "Memuliakan tamu dan ketertiban bertamu.",
                verses = listOf(
                    Verse(1, "مَنْ كَانَ يُؤْمِنُ بِاللَّهِ وَالْيَوْمِ الآخِرِ فَلْيُكْرِمْ ضَيْفَهُ", "Meminta izin dan mengucapkan salam maksimal 3 kali, tidak mengintip ke dalam rumah, serta memuliakan tamu dengan suguhan terbaik.", "Sunnah: Menerima tamu dengan wajah ceria.")
                )
            ),
            PrayerItem(
                id = "sunnah_8",
                title = "Adab Jual Beli & Muamalah",
                mainCategory = "Sunnah Sehari-hari",
                subCategory = "Ibadah",
                description = "Prinsip kejujuran dan keterbukaan dalam bisnis.",
                verses = listOf(
                    Verse(1, "وَأَحَلَّ اللَّهُ الْبَيْعَ وَحَرَّمَ الرِّبَا", "Jujur menjelaskan takaran dan kualitas barang, tidak melakukan penipuan/riba, dan mempermudah urusan pembeli.", "Sunnah: Penuh toleransi dan menepati janji pembayaran.")
                )
            ),
            PrayerItem(
                id = "sunnah_9",
                title = "Adab Keluarga & Silaturahmi",
                mainCategory = "Sunnah Sehari-hari",
                subCategory = "Keluarga",
                description = "Menjaga tali persaudaraan dan keharmonisan sanak kerabat.",
                verses = listOf(
                    Verse(1, "لاَ يَدْخُلُ الْجَنَّةَ قَاطِعُ رَحِمٍ", "Menyambung hubungan dengan kerabat dekat, saling memberi hadiah, berkata lembut, dan saling membantu dalam kebaikan.", "Sunnah: Saling mendoakan dalam kebaikan.")
                )
            )
        )
    }

    fun getQiyamDefaults(): List<PrayerItem> {
        return listOf(
            PrayerItem(
                id = "qiyam_1",
                title = "Panduan & Doa Shalat Tahajud",
                mainCategory = "Qiyamul Lail",
                subCategory = "Ibadah",
                description = "Shalat malam yang dikerjakan setelah bangun tidur malam (2 rakaat minimal).",
                verses = listOf(
                    Verse(
                        number = 1,
                        arabic = "اللَّهُمَّ لَكَ الْحَمْدُ أَنْتَ نُورُ السَّمَاوَاتِ وَالأَرْضِ وَمَنْ فِيهِنَّ",
                        latin = "Allaahumma lakal-hamdu anta nuurus-samaawaati wal-ardhi wa man fiihinna.",
                        translation = "Ya Allah bagi-Mu lah segala puji, Engkaulah Cahaya langit dan bumi beserta segala qualifies yang ada di dalamnya."
                    ),
                    Verse(
                        number = 2,
                        arabic = "وَلَكَ الْحَمْدُ أَنْتَ قَيِّمُ السَّمَاوَاتِ وَالأَرْضِ وَمَنْ فِيهِنَّ وَلَكَ الْحَمْدُ أَنْتَ الْحَقُّ وَوَعْدُكَ الْحَقُّ",
                        latin = "Wa lakal-hamdu anta qayyimus-samaawaati wal-ardhi wa man fiihinna, wa lakal-hamdu antal-haqqu wa wa'dukal-haqq.", "Dan bagi-Mu lah segala puji, Engkaulah Penegak langit dan bumi beserta qualifies yang ada di dalamnya, janji-Mu adalah benar dan firman-Mu adalah benar.")
                )
            ),
            PrayerItem(
                id = "qiyam_2",
                title = "Doa Shalat Witir & Qunut Witir",
                mainCategory = "Qiyamul Lail",
                subCategory = "Ibadah",
                description = "Shalat penutup amalan malam berbilangan ganjil (1 atau 3 rakaat).",
                verses = listOf(
                    Verse(
                        number = 1,
                        arabic = "اللَّهُمَّ إِنَّا نَسْتَعِينُكَ وَنَسْتَغْفِرُكَ وَنَسْتَهْدِيكَ وَنُؤْمِنُ بِكَ وَنَتُوبُ إِلَيْكَ",
                        latin = "Allaahumma innaa nasta'iinuka wa nastaghfiruka wa nastahdiika wa nu'minu bika wa natuubu ilaik.",
                        translation = "Ya Allah sesungguhnya kami memohon pertolongan-Mu, memohon ampunan-Mu, memohon petunjuk-Mu, beriman kepada-Mu dan bertaubat kepada-Mu."
                    ),
                    Verse(
                        number = 2,
                        arabic = "سُبْحَانَ الْمَلِكِ الْقُدُّوسِ (٣x)",
                        latin = "Subhaanal-malikil-qudduus. (3x)",
                        translation = "Maha Suci Raja Yang Maha Suci. (Dibaca 3x setelah selesai salam shalat Witir)."
                    )
                )
            ),
            PrayerItem(
                id = "qiyam_3",
                title = "Surah Pilihan Qiyamul Lail (Surah Al-Mulk)",
                mainCategory = "Qiyamul Lail",
                subCategory = "Ibadah",
                description = "Surah penyelemat dari siksa kubur yang disunnahkan dibaca sebelum tidur atau saat Qiyamul Lail.",
                verses = listOf(
                    Verse(1, "تَبَارَكَ الَّذِي بِيَدِهِ الْمُلْكُ وَهُوَ عَلَىٰ كُلِّ شَيْءٍ قَدِيرٌ", "Tabaarakalladzii biyadihil-mulku wa huwa 'alaa kulli syai'in qadiir.", "Maha Suci Allah Yang di tangan-Nya-lah segala kerajaan, dan Dia Maha Kuasa atas segala sesuatu."),
                    Verse(2, "الَّذِي خَلَقَ الْمَوْتَ وَالْحَيَاةَ لِيَبْلُوَكُمْ أَيُّكُمْ أَحْسَنُ عَمَلًا ۚ وَهُوَ الْعَزِيزُ الْغَفُورُ", "Alladzii khalaqal-mauta wal-hayaata liyabluwakum ayyukum ahsanu 'amalaa, wa huwal-'aziizul-ghafuur.", "Yang menciptakan mati dan hidup, untuk menguji kamu, siapa di antara kamu yang lebih baik amalnya. Dan Dia Maha Perkasa lagi Maha Pengampun.")
                )
            )
        )
    }

    fun getAllItems(): List<PrayerItem> {
        val all = mutableListOf<PrayerItem>()
        all.addAll(getSholatDefaults())
        all.addAll(getInitialDefaults())
        all.addAll(getDzikirDefaults())
        all.addAll(getSunnahDefaults())
        all.addAll(getQiyamDefaults())
        return all
    }
}
