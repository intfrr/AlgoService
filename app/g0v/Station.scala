package g0v


object Geo {
  case class Location(val longitude: Double, val latitude: Double, val altitude: Double)

  val stations = Map(
    "三星" → Location(121.6461,24.6725,103),
    "池端" → Location(121.4667,24.6333,1150),
    "玉蘭" → Location(121.5789,24.6772,494),
    "太平山" → Location(121.5175,24.5072,1810),
    "思源" → Location(121.3486,24.3989,2036),
    "南山" → Location(121.3733,24.4392,1260),
    "牛鬥" → Location(121.5653,24.6394,280),
    "古魯" → Location(121.6633,24.5733,492),
    "五結" → Location(121.7902,24.6887,15),
    "冬山" → Location(121.7853,24.6342,22),
    "寒溪" → Location(121.7083,24.6361,147),
    "新寮" → Location(121.7431,24.6275,101),
    "壯圍" → Location(121.7814,24.7456,17),
    "東澳" → Location(121.8331,24.5206,32),
    "南澳" → Location(121.8103,24.4494,5),
    "東澳嶺" → Location(121.8406,24.5393,750),
    "觀音海岸" → Location(121.7703,24.3851,683),
    "再連" → Location(121.6711,24.7169,140),
    "雙連埤" → Location(121.6331,24.7547,517),
    "龜山島" → Location(121.9531,24.8414,398),
    "北關" → Location(121.8653,24.9092,8),
    "頭城" → Location(121.8064,24.8539,6),
    "大礁溪" → Location(121.67,24.7878,268),
    "礁溪" → Location(121.7592,24.8203,10),
    "羅東" → Location(121.7406,24.685,24),
    "蘇澳" → Location(121.8644,24.6017,25),
    "烏石鼻" → Location(121.8317,24.4847,618),
    "五堵" → Location(121.6867,25.0808,16),
    "基隆" → Location(121.7321,25.1348,27),
    "社子" → Location(121.4614,25.1114,54),
    "天母" → Location(121.5289,25.1194,63),
    "士林" → Location(121.495,25.0922,26),
    "公館" → Location(121.5313,25.0162,22),
    "大直" → Location(121.5347,25.0797,49),
    "劍南" → Location(121.5431,25.0917,264),
    "劍潭" → Location(121.5202,25.0849,120),
    "中正橋" → Location(121.5097,25.0214,15),
    "內湖" → Location(121.5656,25.0811,20),
    "大崙尾山" → Location(121.5656,25.1084,463),
    "大湖" → Location(121.5959,25.0982,187),
    "碧湖國小" → Location(121.5835,25.0865,33),
    "文山" → Location(121.5675,25.0041,40),
    "貓空" → Location(121.5871,24.9707,317),
    "竹子湖" → Location(121.5363,25.165,607),
    "石牌" → Location(121.5059,25.1176,7),
    "關渡" → Location(121.4612,25.1353,111),
    "稻香" → Location(121.4757,25.1498,180),
    "北投國小" → Location(121.4907,25.1357,37),
    "信義" → Location(121.5561,25.0394,71),
    "四獸" → Location(121.5747,25.0311,144),
    "挹翠" → Location(121.5662,25.0189,118),
    "南港" → Location(121.5947,25.0575,42),
    "舊莊" → Location(121.6165,25.0358,47),
    "八里" → Location(121.3953,25.1523,27),
    "三芝" → Location(121.4934,25.2596,86),
    "三重" → Location(121.4813,25.0585,18),
    "大豹" → Location(121.4164,24.8861,600),
    "三峽" → Location(121.3615,24.9408,55),
    "土城" → Location(121.4369,24.9749,32),
    "中和" → Location(121.4822,24.9945,25),
    "五股" → Location(121.4272,25.0853,95),
    "火燒寮" → Location(121.7346,25.0044,287),
    "永和" → Location(121.4967,25.0106,77),
    "富貴角" → Location(121.5573,25.2656,196),
    "石碇" → Location(121.6546,24.9957,204),
    "九芎根" → Location(121.6417,24.9042,378),
    "十三股" → Location(121.6414,24.9458,530),
    "社后橋" → Location(121.6336,25.063,13),
    "五指山" → Location(121.6003,25.1339,685),
    "汐止" → Location(121.6506,25.0687,38),
    "碧湖" → Location(121.7372,24.8928,360),
    "坪林" → Location(121.7014,24.9397,300),
    "四堵" → Location(121.7375,24.8939,401),
    "碧湖" → Location(121.7375,24.8944,386),
    "林口" → Location(121.37,25.0781,238),
    "三和" → Location(121.5858,25.2367,200),
    "金山" → Location(121.6356,25.2253,49),
    "福山" → Location(121.4946,24.7783,405),
    "桶後" → Location(121.5917,24.85,387),
    "下盆" → Location(121.5304,24.7726,527),
    "福隆" → Location(121.9342,25.0192,6),
    "三貂角" → Location(121.9939,25.0094,116),
    "淡水" → Location(121.44,25.1656,19),
    "大屯山" → Location(121.5142,25.1773,1086),
    "深坑" → Location(121.6095,25.0031,57),
    "大桶山" → Location(121.5664,24.87,916),
    "新店" → Location(121.5165,24.9608,24),
    "屈尺" → Location(121.5381,24.9242,70),
    "四十份" → Location(121.585,24.9358,435),
    "翡翠" → Location(121.5719,24.9089,202),
    "新莊" → Location(121.4385,25.0532,25),
    "三貂嶺" → Location(121.8206,25.0592,118),
    "瑞芳" → Location(121.7926,25.1149,97),
    "鼻頭角" → Location(121.9153,25.1308,118),
    "五分山站" → Location(121.7725,25.0728,757),
    "大粗坑" → Location(121.8307,25.0931,84),
    "大坪" → Location(121.6247,25.1677,362),
    "山佳" → Location(121.3939,24.9758,10),
    "泰平" → Location(121.8153,24.9731,460),
    "雙溪" → Location(121.8561,25.0379,40),
    "太平" → Location(121.82,24.9736,403),
    "蘆洲" → Location(121.4641,25.0885,20),
    "鶯歌" → Location(121.3372,24.953,84),
    "八德" → Location(121.275,24.9305,157),
    "埔心" → Location(121.2178,25.0494,70),
    "大溪" → Location(121.2569,24.8847,209),
    "中壢" → Location(121.1771,24.9695,151),
    "平鎮" → Location(121.2064,24.8994,208),
    "桃園" → Location(121.315,24.9942,105),
    "巴陵" → Location(121.3833,24.6833,1220),
    "高義" → Location(121.35,24.7167,620),
    "嘎拉賀" → Location(121.4,24.6333,1260),
    "霞雲" → Location(121.35,24.8,350),
    "復興" → Location(121.3443,24.8221,482),
    "新屋" → Location(121.0433,25.0158,5),
    "楊梅" → Location(121.1401,24.9227,181),
    "水尾" → Location(121.0789,24.9419,106),
    "石門後池" → Location(121.2361,24.8192,142),
    "龍潭" → Location(121.2164,24.8564,270),
    "龜山" → Location(121.3664,25.0331,177),
    "蘆竹" → Location(121.2575,25.0861,19),
    "觀音" → Location(121.1451,25.0289,29),
    "雪霸" → Location(121.1079,24.5287,1956),
    "白蘭" → Location(121.0719,24.5817,1290),
    "太閣南" → Location(121.1522,24.6347,1279),
    "外坪" → Location(121.0829,24.6462,718),
    "玉峰" → Location(121.3,24.6667,780),
    "白石" → Location(121.2167,24.55,1620),
    "鎮西堡" → Location(121.3,24.5667,630),
    "西丘斯山" → Location(121.35,24.5833,2000),
    "梅花" → Location(121.2004,24.6801,523),
    "鳥嘴山" → Location(121.2839,24.7192,839),
    "竹東" → Location(121.0499,24.7693,147),
    "飛鳳山" → Location(121.1107,24.7683,462),
    "峨眉" → Location(121.0091,24.6924,87),
    "湖口" → Location(121.0358,24.9111,79),
    "打鐵坑" → Location(121.1426,24.8518,223),
    "新埔" → Location(121.0292,24.8467,65),
    "新豐" → Location(120.9772,24.8706,143),
    "橫山" → Location(121.1172,24.7117,227),
    "關西" → Location(121.1657,24.8001,146),
    "寶山" → Location(121.0178,24.7381,120),
    "三義" → Location(120.7578,24.4128,341),
    "大河" → Location(120.9382,24.619,122),
    "大湖" → Location(120.8664,24.4189,320),
    "新開" → Location(120.8189,24.3494,326),
    "南湖" → Location(120.8294,24.4028,786),
    "馬拉邦山" → Location(120.8933,24.3692,990),
    "公館" → Location(120.8226,24.5286,83),
    "竹南" → Location(120.8808,24.7108,19),
    "西湖" → Location(120.7403,24.5516,53),
    "卓蘭" → Location(120.8162,24.3148,344),
    "白布帆" → Location(120.8973,24.2993,496),
    "南庄" → Location(120.9921,24.6032,258),
    "南礦" → Location(120.9947,24.5403,1209),
    "鳳美" → Location(121.0261,24.5567,576),
    "南勢" → Location(120.7264,24.5744,125),
    "後龍" → Location(120.7756,24.6081,32),
    "苗栗" → Location(120.8164,24.5667,62),
    "苑裡" → Location(120.65,24.4503,19),
    "馬都安" → Location(120.9219,24.4531,850),
    "南勢山" → Location(120.9156,24.4236,977),
    "八卦" → Location(120.9194,24.4936,737),
    "象鼻" → Location(120.9322,24.3703,950),
    "松安" → Location(120.9778,24.3994,1325),
    "泰安" → Location(120.9594,24.4906,1409),
    "通霄" → Location(120.6964,24.4736,40),
    "造橋" → Location(120.8566,24.6388,20),
    "獅潭" → Location(120.912,24.541,220),
    "銅鑼" → Location(120.7826,24.4915,160),
    "頭份" → Location(120.9042,24.69,26),
    "明德" → Location(120.8786,24.5864,84),
    "大甲" → Location(120.6324,24.3499,100),
    "大安" → Location(120.58,24.3474,30),
    "大肚" → Location(120.564,24.1547,273),
    "大里" → Location(120.6922,24.0944,75),
    "橫山" → Location(120.5993,24.2209,253),
    "中竹林" → Location(120.7433,24.1056,425),
    "清水林" → Location(120.8122,24.0733,723),
    "大坑" → Location(120.7141,24.1749,145),
    "外埔" → Location(120.6975,24.3496,149),
    "石岡" → Location(120.7621,24.2819,290),
    "后里" → Location(120.7215,24.3121,253),
    "西屯" → Location(120.6329,24.182,111),
    "武陵" → Location(121.36,24.38,1734),
    "烏石坑" → Location(120.9375,24.2808,930),
    "德基" → Location(121.182,24.2567,1970),
    "白冷" → Location(120.9217,24.1844,610),
    "雪嶺" → Location(121.0186,24.2825,2620),
    "上谷關" → Location(121.0108,24.205,1000),
    "稍來" → Location(120.9931,24.2675,2205),
    "梨山" → Location(121.2377,24.245,2215),
    "雙崎" → Location(120.8964,24.2903,535),
    "松鶴" → Location(120.9778,24.1786,741),
    "東勢" → Location(120.8249,24.2482,379),
    "新伯公" → Location(120.8328,24.2233,417),
    "伯公龍" → Location(120.8411,24.2742,500),
    "慶福山" → Location(120.8397,24.1828,810),
    "南屯" → Location(120.6301,24.1389,74),
    "烏日" → Location(120.623,24.1075,43),
    "神岡" → Location(120.6503,24.2742,194),
    "清水" → Location(120.5541,24.314,26),
    "新社" → Location(120.8075,24.2016,525),
    "白毛台" → Location(120.8789,24.16,639),
    "龍安" → Location(120.8239,24.1619,563),
    "潭子" → Location(120.6958,24.2148,175),
    "龍井" → Location(120.5208,24.1863,20),
    "豐原" → Location(120.7123,24.2563,230),
    "桐林" → Location(120.7272,24.0681,130),
    "二水" → Location(120.609,23.8128,92),
    "中西" → Location(120.3439,23.8839,15),
    "臺西" → Location(120.2719,23.8506,64),
    "北斗" → Location(120.5065,23.8792,32),
    "田中" → Location(120.5804,23.8587,62),
    "田尾" → Location(120.5014,23.9034,29),
    "伸港" → Location(120.4762,24.1505,24),
    "秀水" → Location(120.4957,24.0359,27),
    "社頭" → Location(120.5781,23.8994,45),
    "芳苑" → Location(120.3119,23.924,12),
    "花壇" → Location(120.5441,24.0178,27),
    "芬園" → Location(120.6131,24.0172,110),
    "員林" → Location(120.5775,23.9483,34),
    "埔心" → Location(120.5176,23.9487,26),
    "埔鹽" → Location(120.4236,24.0022,15),
    "埤頭" → Location(120.4447,23.8678,27),
    "鹿港" → Location(120.4222,24.0769,17),
    "溪州" → Location(120.4881,23.85,14),
    "下水埔" → Location(120.5594,23.8178,110),
    "溪湖" → Location(120.4711,23.9517,27),
    "彰化" → Location(120.5469,24.0806,98),
    "福興" → Location(120.4295,24.043,15),
    "中寮" → Location(120.7585,23.8863,192),
    "蘆竹湳" → Location(120.8039,23.9358,529),
    "翠峰" → Location(121.1967,24.1108,1655),
    "翠巒" → Location(121.2186,24.1944,2297),
    "瑞岩" → Location(121.175,24.1256,1676),
    "仁愛" → Location(121.1228,24.0206,1113),
    "清流" → Location(120.9547,24.0828,934),
    "阿眉" → Location(120.9861,24.1278,1710),
    "萬大" → Location(121.1236,23.9814,1555),
    "武界" → Location(121.0442,23.9147,948),
    "文文社" → Location(121.0128,23.8267,1693),
    "奧萬大" → Location(121.1706,23.9547,1275),
    "楓樹林" → Location(121.0681,23.9886,1266),
    "昆陽" → Location(121.2654,24.1231,3076),
    "合歡山" → Location(121.2641,24.1448,3402),
    "廬山" → Location(121.1733,24.035,1562),
    "南豐" → Location(121.0805,24.019,791),
    "上安橋" → Location(120.8658,23.7303,781),
    "水里" → Location(120.8458,23.8339,593),
    "龍神橋" → Location(120.8636,23.7817,339),
    "郡坑" → Location(120.8629,23.7416,421),
    "埔中" → Location(120.6347,23.8225,439),
    "大鞍" → Location(120.7517,23.6803,1515),
    "桶頭" → Location(120.6456,23.6442,311),
    "中心崙" → Location(120.7042,23.7303,677),
    "竹山" → Location(120.6778,23.7647,161),
    "神木村" → Location(120.8347,23.5361,1595),
    "西巒" → Location(120.8756,23.7564,1001),
    "新興橋" → Location(120.8597,23.5658,897),
    "東埔" → Location(120.9167,23.5581,887),
    "卡奈托灣" → Location(121.0797,23.7561,1700),
    "青雲" → Location(120.9411,23.8008,393),
    "豐丘" → Location(120.8789,23.67,1151),
    "丹大" → Location(121.1328,23.7556,2568),
    "望鄉" → Location(120.9028,23.6211,2403),
    "和社" → Location(120.8808,23.5925,825),
    "信義" → Location(120.8428,23.6914,536),
    "豐丘" → Location(120.8686,23.6699,613),
    "神木" → Location(120.8482,23.5297,1179),
    "六分寮" → Location(120.6302,23.9266,429),
    "外大坪" → Location(120.9097,23.9606,725),
    "埔里" → Location(120.9831,23.9639,732),
    "北坑" → Location(120.9989,23.9264,601),
    "凌霄" → Location(121.0067,24.0189,1318),
    "大肚城" → Location(120.9442,23.9722,451),
    "雙冬" → Location(120.7942,23.9692,630),
    "草屯" → Location(120.6722,23.9754,120),
    "水長流" → Location(120.8525,24.0636,660),
    "樟湖" → Location(120.8392,23.9069,1098),
    "九份二山" → Location(120.8372,23.9639,917),
    "長福" → Location(120.8717,24.1039,736),
    "北山" → Location(120.8664,23.9872,393),
    "九份二山" → Location(120.8487,23.9536,527),
    "日月潭" → Location(120.8999,23.883,1015),
    "魚池" → Location(120.9206,23.9028,724),
    "溪頭" → Location(120.7992,23.6631,1810),
    "鳳凰" → Location(120.7792,23.7297,910),
    "集集" → Location(120.7669,23.8283,235),
    "宜梧" → Location(120.161,23.5374,5),
    "土庫" → Location(120.3817,23.69,33),
    "斗六" → Location(120.5081,23.7072,40),
    "阿丹" → Location(120.5036,23.6597,51),
    "北港" → Location(120.2867,23.5706,24),
    "山豬湖" → Location(120.5931,23.5886,649),
    "大埔" → Location(120.5972,23.6431,369),
    "草嶺" → Location(120.6933,23.5956,1132),
    "華山" → Location(120.5999,23.5953,522),
    "四湖" → Location(120.2172,23.6311,23),
    "西螺" → Location(120.4444,23.8064,79),
    "坪頂" → Location(120.631,23.7556,305),
    "虎尾" → Location(120.4325,23.7214,38),
    "崙背" → Location(120.3108,23.7575,59),
    "後安寮" → Location(120.225,23.7911,29),
    "褒忠" → Location(120.2997,23.7067,21),
    "中坑" → Location(120.5175,23.5631,167),
    "草嶺(嘉)" → Location(120.5683,23.2536,369),
    "馬頭山" → Location(120.5736,23.3264,245),
    "中埔" → Location(120.5122,23.4253,110),
    "魚寮" → Location(120.3539,23.4803,41),
    "南靖" → Location(120.3772,23.4136,43),
    "朴子" → Location(120.2494,23.4714,8),
    "石磐龍" → Location(120.655,23.4981,1083),
    "樟腦寮" → Location(120.5994,23.5386,798),
    "內埔" → Location(120.5561,23.4875,130),
    "奮起湖" → Location(120.6911,23.4958,1385),
    "鰲鼓" → Location(120.1403,23.5072,23),
    "新高口" → Location(120.8703,23.4808,2540),
    "豐山" → Location(120.7408,23.5969,1052),
    "豐山" → Location(120.7399,23.5873,828),
    "瑞里" → Location(120.6669,23.5469,1252),
    "大湖" → Location(120.6125,23.4767,722),
    "頭凍" → Location(120.5953,23.4081,986),
    "瀨頭" → Location(120.6458,23.4078,1090),
    "小公田" → Location(120.5728,23.3636,768),
    "溪口" → Location(120.3961,23.6058,14),
    "東後寮" → Location(120.2403,23.3714,19),
    "七股" → Location(120.1381,23.1436,6),
    "下營" → Location(120.2481,23.2269,19),
    "環湖" → Location(120.4103,23.15,44),
    "大內" → Location(120.3533,23.1219,61),
    "王爺宮" → Location(120.3911,23.2225,144),
    "北門" → Location(120.1164,23.27,14),
    "玉井" → Location(120.4525,23.1275,42),
    "關子嶺" → Location(120.5036,23.3289,403),
    "白河" → Location(120.4208,23.3264,33),
    "大棟山" → Location(120.5142,23.3133,1246),
    "和順" → Location(120.1367,23.0783,4),
    "佳里" → Location(120.1367,23.175,2),
    "東原" → Location(120.4553,23.2931,232),
    "東河" → Location(120.3772,23.2986,19),
    "關山" → Location(120.5858,23.175,223),
    "北寮" → Location(120.4869,23.0816,105),
    "羌黃坑" → Location(120.5286,23.0737,274),
    "新營" → Location(120.3139,23.2942,16),
    "善化" → Location(120.2894,23.1144,9),
    "虎頭埤" → Location(120.3397,23.0231,60),
    "新市" → Location(120.2906,23.0639,76),
    "楠西" → Location(120.4764,23.185,150),
    "曾文" → Location(120.4897,23.2208,174),
    "崎頂" → Location(120.3612,22.9613,80),
    "媽祖廟" → Location(120.2853,22.9933,23),
    "沙崙" → Location(120.3011,22.9375,25),
    "岸內" → Location(120.2522,23.3317,15),
    "鳳雄" → Location(120.3442,22.7525,55),
    "大寮" → Location(120.4239,22.6119,24),
    "溪埔" → Location(120.4386,22.7403,36),
    "鳳森" → Location(120.3845,22.5469,51),
    "木柵" → Location(120.4583,22.9769,94),
    "大津" → Location(120.6381,22.89,190),
    "新發" → Location(120.6525,23.0536,470),
    "左營" → Location(120.2872,22.6789,13),
    "古亭坑" → Location(120.3939,22.895,30),
    "甲仙" → Location(120.5825,23.0817,270),
    "月眉" → Location(120.5317,22.9731,112),
    "集來" → Location(120.5847,23.0304,403),
    "表湖" → Location(120.6561,23.2619,1163),
    "民生" → Location(120.6972,23.2817,1040),
    "阿蓮" → Location(120.3195,22.8849,34),
    "吉東" → Location(120.5492,22.8433,95),
    "美濃" → Location(120.5111,22.9006,46),
    "溪南" → Location(120.7983,23.0778,1792),
    "御油山" → Location(120.7069,23.0039,1637),
    "南天池" → Location(120.9036,23.2758,2700),
    "梅山" → Location(120.8154,23.2703,870),
    "復興" → Location(120.7978,23.2242,700),
    "小關山" → Location(120.8053,23.1558,1781),
    "高中" → Location(120.7089,23.1367,760),
    "楠溪" → Location(120.8844,23.4381,1857),
    "排雲" → Location(120.946,23.4651,3690),
    "新興" → Location(120.2906,22.6291,20),
    "三爺" → Location(120.2719,22.8383,35),
    "旗山" → Location(120.4861,22.8797,63),
    "旗津" → Location(120.2779,22.5904,6),
    "鳳山" → Location(120.3481,22.6486,27),
    "岡山" → Location(120.2897,22.7569,31),
    "尖山" → Location(120.3597,22.815,60),
    "竹子腳" → Location(120.3353,22.8147,51),
    "古夏" → Location(120.6372,22.7714,140),
    "上德文" → Location(120.6964,22.765,820),
    "尾寮山" → Location(120.6758,22.835,1018),
    "三地門" → Location(120.6317,22.7119,99),
    "龍泉" → Location(120.5942,22.6689,61),
    "石門山" → Location(120.7417,22.1167,260),
    "旭海" → Location(120.8786,22.1978,20),
    "壽卡" → Location(120.8511,22.2417,489),
    "牡丹" → Location(120.8297,22.1942,285),
    "牡丹池山" → Location(120.8325,22.1696,504),
    "車城" → Location(120.7081,22.0758,54),
    "里港" → Location(120.4886,22.8014,42),
    "來義" → Location(120.668,22.5276,189),
    "楓港" → Location(120.6847,22.1917,63),
    "枋山" → Location(120.6531,22.2486,36),
    "枋寮" → Location(120.59,22.3681,69),
    "東港" → Location(120.4333,22.4667,31),
    "南州" → Location(120.5086,22.4944,20),
    "屏東" → Location(120.4836,22.6619,26),
    "貓鼻頭" → Location(120.7281,21.9244,49),
    "墾丁" → Location(120.7942,21.9478,5),
    "大漢山" → Location(120.7451,22.4059,1654),
    "力里" → Location(120.62,22.4297,91),
    "春日" → Location(120.6203,22.3722,86),
    "琉球嶼" → Location(120.3542,22.3339,51),
    "赤山" → Location(120.6083,22.5928,48),
    "來義" → Location(120.6175,22.5289,74),
    "檳榔" → Location(120.8283,22.0706,250),
    "佳樂水" → Location(120.8367,21.9942,94),
    "瑪家" → Location(120.6789,22.6847,740),
    "潮州" → Location(120.5319,22.5361,22),
    "阿禮" → Location(120.7356,22.7444,1040),
    "麟洛" → Location(120.5436,22.6592,54),
    "新圍" → Location(120.53,22.7539,56),
    "大武" → Location(120.8957,22.3576,8),
    "大鳥" → Location(120.9022,22.3915,139),
    "太麻里" → Location(120.9858,22.6103,522),
    "大溪山" → Location(120.9353,22.48,375),
    "金崙" → Location(120.9589,22.54,236),
    "華源" → Location(121.0156,22.6597,80),
    "成功" → Location(121.3654,23.0992,34),
    "南美山" → Location(121.3743,23.1521,222),
    "池上" → Location(121.2017,23.1214,289),
    "知本" → Location(120.9975,22.6867,507),
    "利嘉" → Location(121.0424,22.8111,516),
    "射馬干" → Location(121.0298,22.7269,55),
    "紅葉山" → Location(121.0311,22.9217,1659),
    "東河" → Location(121.2983,22.9736,65),
    "都蘭" → Location(121.2208,22.8797,23),
    "金峰" → Location(120.9308,22.599,177),
    "長濱" → Location(121.4039,23.2886,288),
    "向陽" → Location(120.9781,23.25,2280),
    "紅石" → Location(121.12,23.0714,1621),
    "下馬" → Location(121.0622,23.1522,794),
    "摩天" → Location(121.0192,23.2011,1580),
    "鹿野" → Location(121.1147,22.9186,313),
    "南田" → Location(120.8819,22.2919,22),
    "土阪" → Location(120.8794,22.4547,122),
    "綠島" → Location(121.4753,22.6539,304),
    "玉里" → Location(121.3397,23.3217,174),
    "高寮" → Location(121.3486,23.3961,128),
    "大農" → Location(121.405,23.6169,200),
    "富源" → Location(121.3704,23.5898,298),
    "光復" → Location(121.4167,23.6625,140),
    "大興" → Location(121.3699,23.6436,196),
    "吉安" → Location(121.5547,23.9753,50),
    "銅門" → Location(121.4878,23.9675,125),
    "洛韶" → Location(121.4458,24.2064,1260),
    "慈恩" → Location(121.3803,24.1939,2049),
    "布洛灣" → Location(121.5797,24.1736,200),
    "龍澗" → Location(121.4033,24.025,1306),
    "三棧" → Location(121.597,24.1188,706),
    "大禹嶺" → Location(121.3078,24.1879,2823),
    "天祥" → Location(121.4875,24.1814,550),
    "水源" → Location(121.5292,23.9936,558),
    "富世" → Location(121.6219,24.1497,109),
    "和中" → Location(121.7333,24.2681,7),
    "佳心" → Location(121.205,23.3469,704),
    "立山" → Location(121.3192,23.445,434),
    "卓樂" → Location(121.2636,23.2989,198),
    "豐南" → Location(121.2543,23.124,489),
    "明里" → Location(121.2542,23.2106,211),
    "新城" → Location(121.6012,24.0397,23),
    "舞鶴" → Location(121.3658,23.4697,272),
    "西林" → Location(121.4097,23.8086,160),
    "東壙" → Location(121.3969,23.8556,653),
    "大觀" → Location(121.365,23.7161,539),
    "太安" → Location(121.3619,23.6686,1050),
    "紅葉" → Location(121.3306,23.495,218),
    "中興" → Location(121.4906,23.7714,68),
    "吳全城" → Location(121.54,23.8889,27),
    "壽豐" → Location(121.4997,23.8711,40),
    "月眉山" → Location(121.5403,23.8258,511),
    "鯉魚潭" → Location(121.5008,23.9374,135),
    "大坑" → Location(121.5819,23.8806,415),
    "水璉" → Location(121.5342,23.7989,283),
    "鳳林山" → Location(121.4214,23.7478,650),
    "鳳林" → Location(121.4375,23.7453,130),
    "鳳義坑" → Location(121.4207,23.7442,304),
    "加路蘭山" → Location(121.5189,23.6842,746),
    "豐濱" → Location(121.5058,23.5803,214),
    "靜浦" → Location(121.4867,23.4569,92)
  )
}