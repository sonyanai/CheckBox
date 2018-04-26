package jp.techacademy.son.checkbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;


public class MainActivity extends AppCompatActivity {

    LinearLayout layout;
    LinearLayout tohokuLayout;
    LinearLayout hokkaidoLayout;
    LinearLayout aomoriLayout;
    LinearLayout iwateLayout;
    LinearLayout miyagiLayout;
    LinearLayout akitaLayout;
    LinearLayout yamagataLayout;
    LinearLayout hukushimaLayout;
    LinearLayout ibarakiLayout;
    LinearLayout tochigiLayout;
    LinearLayout gunmaLayout;
    LinearLayout saitamaLayout;
    LinearLayout chibaLayout;
    LinearLayout tokyoLayout;
    LinearLayout kanagawaLayout;
    LinearLayout nigataLayout;
    LinearLayout toyamaLayout;
    LinearLayout ishikawaLayout;
    LinearLayout hukuiLayout;
    LinearLayout yamanashiLayout;
    LinearLayout naganoLayout;
    LinearLayout gihuLayout;
    LinearLayout shizuokaLayout;
    LinearLayout aitiLayout;
    LinearLayout mieLayout;
    LinearLayout shigaLayout;
    LinearLayout kyotoLayout;
    LinearLayout osakaLayout;
    LinearLayout hyogoLayout;
    LinearLayout naraLayout;
    LinearLayout wakayamaLayout;
    LinearLayout tottoriLayout;
    LinearLayout shimaneLayout;
    LinearLayout okayamaLayout;
    LinearLayout hiroshimaLayout;
    LinearLayout yamaguchiLayout;
    LinearLayout tokushimaLayout;
    LinearLayout kagawaLayout;
    LinearLayout ehimeLayout;
    LinearLayout kochiLayout;
    LinearLayout hukuokaLayout;
    LinearLayout sagaLayout;
    LinearLayout nagasakiLayout;
    LinearLayout kumamotoLayout;
    LinearLayout oitaLayout;
    LinearLayout miyazakiLayout;
    LinearLayout kagoshimaLayout;
    LinearLayout okinawaLayout;




    LinearLayout kantoLayout;
    LinearLayout tyubuLayout;
    LinearLayout kinkiLayout;
    LinearLayout tyugokuLayout;
    LinearLayout shikokuLayout;
    LinearLayout kyusyuLayout;
    LinearLayout cityLayout;
    CheckBox checkTohoku;
    CheckBox hokkaidoCheckBox;
    CheckBox aomoriCheckBox;
    CheckBox iwateCheckBox;
    CheckBox miyagiCheckBox;
    CheckBox akitaCheckBox;
    CheckBox yamagataCheckBox;
    CheckBox hukushimaCheckBox;
    CheckBox ibarakiCheckBox;
    CheckBox tochigiCheckBox;
    CheckBox gunmaCheckBox;
    CheckBox saitamaCheckBox;
    CheckBox chibaCheckBox;
    CheckBox tokyoCheckBox;
    CheckBox kanagawaCheckBox;
    CheckBox nigataCheckBox;
    CheckBox toyamaCheckBox;
    CheckBox ishikawaCheckBox;
    CheckBox hukuiCheckBox;
    CheckBox yamanashiCheckBox;
    CheckBox naganoCheckBox;
    CheckBox gihuCheckBox;
    CheckBox shizuokaCheckBox;
    CheckBox aitiCheckBox;
    CheckBox mieCheckBox;
    CheckBox shigaCheckBox;
    CheckBox kyotoCheckBox;
    CheckBox osakaCheckBox;
    CheckBox hyogoCheckBox;
    CheckBox naraCheckBox;
    CheckBox wakayamaCheckBox;
    CheckBox tottoriCheckBox;
    CheckBox shimaneCheckBox;
    CheckBox okayamaCheckBox;
    CheckBox hiroshimaCheckBox;
    CheckBox yamaguchiCheckBox;
    CheckBox tokushimaCheckBox;
    CheckBox kagawaCheckBox;
    CheckBox ehimeCheckBox;
    CheckBox kochiCheckBox;
    CheckBox hukuokaCheckBox;
    CheckBox sagaCheckBox;
    CheckBox nagasakiCheckBox;
    CheckBox kumamotoCheckBox;
    CheckBox oitaCheckBox;
    CheckBox miyazakiCheckBox;
    CheckBox kagoshimaCheckBox;
    CheckBox okinawaCheckBox;
    CheckBox checkKanto;
    CheckBox checkTyubu;
    CheckBox checkKinki;
    CheckBox checkTyugoku;
    CheckBox checkShikoku;
    CheckBox checkKyusyu;
    int cityId;
    int x = 0;

    ArrayList<String> tohokuList = new ArrayList<String>();
    ArrayList<String> kantoList = new ArrayList<String>();
    ArrayList<String> tyubuList = new ArrayList<String>();
    ArrayList<String> kinkiList = new ArrayList<String>();
    ArrayList<String> tyugokuList = new ArrayList<String>();
    ArrayList<String> shikokuList = new ArrayList<String>();
    ArrayList<String> kyusyuList = new ArrayList<String>();

    public class ApiTask extends GetWeatherForecastTask {
        @Override
        protected void onPostExecute(WeatherForecast data) {
            super.onPostExecute(data);


            if (data != null) {
                for (WeatherForecast.Forecast forecast : data.forecastList) {
                    CheckBox checkBox = new CheckBox(getApplicationContext());
                    checkBox.setId(Integer.parseInt(forecast.id));
                    checkBox.setText(forecast.name);
                    checkBox.setChecked(true);

                    LinearLayout.LayoutParams checkBoxLayoutParams = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.WRAP_CONTENT,
                            LinearLayout.LayoutParams.WRAP_CONTENT);
                    checkBox.setLayoutParams(checkBoxLayoutParams);

                    if (x < 195) {
                        hokkaidoLayout.addView(checkBox);
                    } else if (x < 235) {
                        aomoriLayout.addView(checkBox);
                    } else if (x < 268) {
                        iwateLayout.addView(checkBox);
                    } else if (x < 308) {
                        miyagiLayout.addView(checkBox);
                    } else if (x < 333) {
                        akitaLayout.addView(checkBox);
                    } else if (x < 368) {
                        yamagataLayout.addView(checkBox);
                    } else if (x < 427) {
                        hukushimaLayout.addView(checkBox);
                    } else if (x < 471) {
                        ibarakiLayout.addView(checkBox);
                    } else if (x < 496) {
                        tochigiLayout.addView(checkBox);
                    } else if (x < 531) {
                        gunmaLayout.addView(checkBox);
                    } else if (x < 604) {
                        saitamaLayout.addView(checkBox);
                    } else if (x < 664) {
                        chibaLayout.addView(checkBox);
                    } else if (x < 726) {
                        tokyoLayout.addView(checkBox);
                    } else if (x < 787) {
                        kanagawaLayout.addView(checkBox);
                    } else if (x < 825) {
                        nigataLayout.addView(checkBox);
                    } else if (x < 840) {
                        toyamaLayout.addView(checkBox);
                    } else if (x < 859) {
                        ishikawaLayout.addView(checkBox);
                    } else if (x < 876) {
                        hukuiLayout.addView(checkBox);
                    } else if (x < 903) {
                        yamanashiLayout.addView(checkBox);
                    } else if (x < 980) {
                        naganoLayout.addView(checkBox);
                    } else if (x < 1022) {
                        gihuLayout.addView(checkBox);
                    } else if (x < 1067) {
                        shizuokaLayout.addView(checkBox);
                    } else if (x < 1137) {
                        aitiLayout.addView(checkBox);
                    } else if (x < 1166) {
                        mieLayout.addView(checkBox);
                    } else if (x < 1185) {
                        shigaLayout.addView(checkBox);
                    } else if (x < 1222) {
                        kyotoLayout.addView(checkBox);
                    } else if (x < 1296) {
                        osakaLayout.addView(checkBox);
                    } else if (x < 1346) {
                        hyogoLayout.addView(checkBox);
                    } else if (x < 1385) {
                        naraLayout.addView(checkBox);
                    } else if (x < 1415) {
                        wakayamaLayout.addView(checkBox);
                    } else if (x < 1434) {
                        tottoriLayout.addView(checkBox);
                    } else if (x < 1465) {
                        shimaneLayout.addView(checkBox);
                    } else if (x < 1484) {
                        okayamaLayout.addView(checkBox);
                    } else if (x < 1515) {
                        hiroshimaLayout.addView(checkBox);
                    } else if (x < 1534) {
                        yamaguchiLayout.addView(checkBox);
                    } else if (x < 1558) {
                        tokushimaLayout.addView(checkBox);
                    } else if (x < 1575) {
                        kagawaLayout.addView(checkBox);
                    } else if (x < 1595) {
                        ehimeLayout.addView(checkBox);
                    } else if (x < 1629) {
                        kochiLayout.addView(checkBox);
                    } else if (x < 1703) {
                        hukuokaLayout.addView(checkBox);
                    } else if (x < 1723) {
                        sagaLayout.addView(checkBox);
                    } else if (x < 1744) {
                        nagasakiLayout.addView(checkBox);
                    } else if (x < 1794) {
                        kumamotoLayout.addView(checkBox);
                    } else if (x < 1812) {
                        oitaLayout.addView(checkBox);
                    } else if (x < 1838) {
                        miyazakiLayout.addView(checkBox);
                    } else if (x < 1881) {
                        kagoshimaLayout.addView(checkBox);
                    } else if (x < 1922) {
                        okinawaLayout.addView(checkBox);
                    }


                    //cityLayout.addView(checkBox);
                    x += 1;
                }
            } else if (exception != null) {
                Toast.makeText(getApplicationContext(), exception.getMessage(),
                        Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tohokuList.add("北海道");
        tohokuList.add("青森県");
        tohokuList.add("岩手県");
        tohokuList.add("宮城県");
        tohokuList.add("秋田県");
        tohokuList.add("山形県");
        tohokuList.add("福島県");

        kantoList.add("茨城県");
        kantoList.add("栃木県");
        kantoList.add("群馬県");
        kantoList.add("埼玉県");
        kantoList.add("千葉県");
        kantoList.add("東京都");
        kantoList.add("神奈川県");

        tyubuList.add("新潟県");
        tyubuList.add("富山県");
        tyubuList.add("石川県");
        tyubuList.add("福井県");
        tyubuList.add("山梨県");
        tyubuList.add("長野県");
        tyubuList.add("岐阜県");
        tyubuList.add("静岡県");
        tyubuList.add("愛知県");

        kinkiList.add("三重県");
        kinkiList.add("滋賀県");
        kinkiList.add("京都府");
        kinkiList.add("大阪府");
        kinkiList.add("兵庫県");
        kinkiList.add("奈良県");
        kinkiList.add("和歌山県");

        tyugokuList.add("鳥取県");
        tyugokuList.add("島根県");
        tyugokuList.add("岡山県");
        tyugokuList.add("広島県");
        tyugokuList.add("山口県");

        shikokuList.add("徳島県");
        shikokuList.add("香川県");
        shikokuList.add("愛媛県");
        shikokuList.add("高知県");

        kyusyuList.add("福岡県");
        kyusyuList.add("佐賀県");
        kyusyuList.add("長崎県");
        kyusyuList.add("熊本県");
        kyusyuList.add("大分県");
        kyusyuList.add("宮崎県");
        kyusyuList.add("鹿児島県");
        kyusyuList.add("沖縄県");


        ScrollView topLayout = new ScrollView(getApplicationContext());
        topLayout.setLayoutParams(new ScrollView.LayoutParams(
                ScrollView.LayoutParams.MATCH_PARENT,
                ScrollView.LayoutParams.MATCH_PARENT));
        setContentView(topLayout);

        layout = new LinearLayout(getApplicationContext());
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        topLayout.addView(layout);

//東北チェックボックス
        int i = 1;
        CheckBox checkBox1 = new CheckBox(getApplicationContext());
        checkBox1.setId(i);
        checkBox1.setText("東北地方");
        LinearLayout.LayoutParams checkBoxLayoutParams1 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        checkBox1.setLayoutParams(checkBoxLayoutParams1);
        layout.addView(checkBox1);
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tohokuLayout.setVisibility(View.VISIBLE);
            }
        });



//東北レイアウト
        tohokuLayout = new LinearLayout(getApplicationContext());
        tohokuLayout.setOrientation(LinearLayout.VERTICAL);
        tohokuLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        layout.addView(tohokuLayout);
        tohokuLayout.setVisibility(View.GONE);

//北海道チェックボックス
        cityId = 1;
        hokkaidoCheckBox = new CheckBox(getApplicationContext());
        hokkaidoCheckBox.setId(cityId);
        hokkaidoCheckBox.setText("北海道");
        LinearLayout.LayoutParams hokkaidoCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        hokkaidoCheckBox.setLayoutParams(hokkaidoCheckBoxLayoutParams);
        tohokuLayout.addView(hokkaidoCheckBox);
        hokkaidoCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hokkaidoLayout.setVisibility(View.VISIBLE);
            }
        });

//北海道レイアウト
        hokkaidoLayout = new LinearLayout(getApplicationContext());
        hokkaidoLayout.setOrientation(LinearLayout.VERTICAL);
        hokkaidoLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tohokuLayout.addView(hokkaidoLayout);
        hokkaidoLayout.setVisibility(View.GONE);

        String areaId = String.valueOf(cityId);
        new ApiTask().execute("0" + areaId);

//青森チェックボックス
        cityId += 1;
        aomoriCheckBox = new CheckBox(getApplicationContext());
        aomoriCheckBox.setId(cityId);
        aomoriCheckBox.setText("青森県");
        LinearLayout.LayoutParams aomoriCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        aomoriCheckBox.setLayoutParams(aomoriCheckBoxLayoutParams);
        tohokuLayout.addView(aomoriCheckBox);
        aomoriCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aomoriLayout.setVisibility(View.VISIBLE);
            }
        });

//青森レイアウト
        aomoriLayout = new LinearLayout(getApplicationContext());
        aomoriLayout.setOrientation(LinearLayout.VERTICAL);
        aomoriLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tohokuLayout.addView(aomoriLayout);
        aomoriLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute("0" + areaId);


        //岩手チェックボックス
        cityId += 1;
        iwateCheckBox = new CheckBox(getApplicationContext());
        iwateCheckBox.setId(cityId);
        iwateCheckBox.setText("岩手県");
        LinearLayout.LayoutParams iwateCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        iwateCheckBox.setLayoutParams(iwateCheckBoxLayoutParams);
        tohokuLayout.addView(iwateCheckBox);
        iwateCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iwateLayout.setVisibility(View.VISIBLE);
            }
        });

//岩手レイアウト
        iwateLayout = new LinearLayout(getApplicationContext());
        iwateLayout.setOrientation(LinearLayout.VERTICAL);
        iwateLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tohokuLayout.addView(iwateLayout);
        iwateLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute("0" + areaId);



        //宮城チェックボックス
        cityId += 1;
        miyagiCheckBox = new CheckBox(getApplicationContext());
        miyagiCheckBox.setId(cityId);
        miyagiCheckBox.setText("宮城県");
        LinearLayout.LayoutParams miyagiCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        miyagiCheckBox.setLayoutParams(miyagiCheckBoxLayoutParams);
        tohokuLayout.addView(miyagiCheckBox);
        miyagiCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                miyagiLayout.setVisibility(View.VISIBLE);
            }
        });

//宮城レイアウト
        miyagiLayout = new LinearLayout(getApplicationContext());
        miyagiLayout.setOrientation(LinearLayout.VERTICAL);
        miyagiLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tohokuLayout.addView(miyagiLayout);
        miyagiLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute("0" + areaId);



        //秋田チェックボックス
        cityId += 1;
        akitaCheckBox = new CheckBox(getApplicationContext());
        akitaCheckBox.setId(cityId);
        akitaCheckBox.setText("秋田県");
        LinearLayout.LayoutParams akitaCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        akitaCheckBox.setLayoutParams(akitaCheckBoxLayoutParams);
        tohokuLayout.addView(akitaCheckBox);
        akitaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                akitaLayout.setVisibility(View.VISIBLE);
            }
        });

//秋田レイアウト
        akitaLayout = new LinearLayout(getApplicationContext());
        akitaLayout.setOrientation(LinearLayout.VERTICAL);
        akitaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tohokuLayout.addView(akitaLayout);
        akitaLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute("0" + areaId);


        //山形チェックボックス
        cityId += 1;
        yamagataCheckBox = new CheckBox(getApplicationContext());
        yamagataCheckBox.setId(cityId);
        yamagataCheckBox.setText("山形県");
        LinearLayout.LayoutParams yamagataCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        yamagataCheckBox.setLayoutParams(yamagataCheckBoxLayoutParams);
        tohokuLayout.addView(yamagataCheckBox);
        yamagataCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yamagataLayout.setVisibility(View.VISIBLE);
            }
        });

//山形レイアウト
        yamagataLayout = new LinearLayout(getApplicationContext());
        yamagataLayout.setOrientation(LinearLayout.VERTICAL);
        yamagataLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tohokuLayout.addView(yamagataLayout);
        yamagataLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute("0" + areaId);


        //福島チェックボックス
        cityId += 1;
        hukushimaCheckBox = new CheckBox(getApplicationContext());
        hukushimaCheckBox.setId(cityId);
        hukushimaCheckBox.setText("福島県");
        LinearLayout.LayoutParams hukushimaCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        hukushimaCheckBox.setLayoutParams(hukushimaCheckBoxLayoutParams);
        tohokuLayout.addView(hukushimaCheckBox);
        hukushimaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hukushimaLayout.setVisibility(View.VISIBLE);
            }
        });

//福島レイアウト
        hukushimaLayout = new LinearLayout(getApplicationContext());
        hukushimaLayout.setOrientation(LinearLayout.VERTICAL);
        hukushimaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tohokuLayout.addView(hukushimaLayout);
        hukushimaLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute("0" + areaId);



//関東レイアウト
        i += 1;
        CheckBox checkBox2 = new CheckBox(getApplicationContext());
        checkBox2.setId(i);
        checkBox2.setText("関東地方");
        LinearLayout.LayoutParams checkBoxLayoutParams2 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        checkBox2.setLayoutParams(checkBoxLayoutParams2);
        layout.addView(checkBox2);
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kantoLayout.setVisibility(View.VISIBLE);
            }
        });
        kantoLayout = new LinearLayout(getApplicationContext());
        kantoLayout.setOrientation(LinearLayout.VERTICAL);
        kantoLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kantoLayout.setVisibility(View.GONE);
        layout.addView(kantoLayout);


        //茨城チェックボックス
        cityId += 1;
        ibarakiCheckBox = new CheckBox(getApplicationContext());
        ibarakiCheckBox.setId(cityId);
        ibarakiCheckBox.setText("茨城県");
        LinearLayout.LayoutParams ibarakiCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        ibarakiCheckBox.setLayoutParams(ibarakiCheckBoxLayoutParams);
        kantoLayout.addView(ibarakiCheckBox);
        ibarakiCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ibarakiLayout.setVisibility(View.VISIBLE);
            }
        });

//茨城レイアウト
        ibarakiLayout = new LinearLayout(getApplicationContext());
        ibarakiLayout.setOrientation(LinearLayout.VERTICAL);
        ibarakiLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kantoLayout.addView(ibarakiLayout);
        ibarakiLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute("0" + areaId);



        //栃木チェックボックス
        cityId += 1;
        tochigiCheckBox = new CheckBox(getApplicationContext());
        tochigiCheckBox.setId(cityId);
        tochigiCheckBox.setText("栃木県");
        LinearLayout.LayoutParams tochigiCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        tochigiCheckBox.setLayoutParams(tochigiCheckBoxLayoutParams);
        kantoLayout.addView(tochigiCheckBox);
        tochigiCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tochigiLayout.setVisibility(View.VISIBLE);
            }
        });

//栃木レイアウト
        tochigiLayout = new LinearLayout(getApplicationContext());
        tochigiLayout.setOrientation(LinearLayout.VERTICAL);
        tochigiLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kantoLayout.addView(tochigiLayout);
        tochigiLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute("0" + areaId);



        //群馬チェックボックス
        cityId += 1;
        gunmaCheckBox = new CheckBox(getApplicationContext());
        gunmaCheckBox.setId(cityId);
        gunmaCheckBox.setText("群馬県");
        LinearLayout.LayoutParams gunmaCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        gunmaCheckBox.setLayoutParams(gunmaCheckBoxLayoutParams);
        kantoLayout.addView(gunmaCheckBox);
        gunmaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gunmaLayout.setVisibility(View.VISIBLE);
            }
        });

//群馬レイアウト
        gunmaLayout = new LinearLayout(getApplicationContext());
        gunmaLayout.setOrientation(LinearLayout.VERTICAL);
        gunmaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kantoLayout.addView(gunmaLayout);
        gunmaLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);



        //埼玉チェックボックス
        cityId += 1;
        saitamaCheckBox = new CheckBox(getApplicationContext());
        saitamaCheckBox.setId(cityId);
        saitamaCheckBox.setText("埼玉県");
        LinearLayout.LayoutParams saitamaCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        saitamaCheckBox.setLayoutParams(saitamaCheckBoxLayoutParams);
        kantoLayout.addView(saitamaCheckBox);
        saitamaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saitamaLayout.setVisibility(View.VISIBLE);
            }
        });

//埼玉レイアウト
        saitamaLayout = new LinearLayout(getApplicationContext());
        saitamaLayout.setOrientation(LinearLayout.VERTICAL);
        saitamaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kantoLayout.addView(saitamaLayout);
        saitamaLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);



        //千葉チェックボックス
        cityId += 1;
        chibaCheckBox = new CheckBox(getApplicationContext());
        chibaCheckBox.setId(cityId);
        chibaCheckBox.setText("千葉県");
        LinearLayout.LayoutParams chibaCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        chibaCheckBox.setLayoutParams(chibaCheckBoxLayoutParams);
        kantoLayout.addView(chibaCheckBox);
        chibaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chibaLayout.setVisibility(View.VISIBLE);
            }
        });

//千葉レイアウト
        chibaLayout = new LinearLayout(getApplicationContext());
        chibaLayout.setOrientation(LinearLayout.VERTICAL);
        chibaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kantoLayout.addView(chibaLayout);
        chibaLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);



        //東京チェックボックス
        cityId += 1;
        tokyoCheckBox = new CheckBox(getApplicationContext());
        tokyoCheckBox.setId(cityId);
        tokyoCheckBox.setText("東京都");
        LinearLayout.LayoutParams tokyoCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        tokyoCheckBox.setLayoutParams(tokyoCheckBoxLayoutParams);
        kantoLayout.addView(tokyoCheckBox);
        tokyoCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tokyoLayout.setVisibility(View.VISIBLE);
            }
        });

//東京レイアウト
        tokyoLayout = new LinearLayout(getApplicationContext());
        tokyoLayout.setOrientation(LinearLayout.VERTICAL);
        tokyoLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kantoLayout.addView(tokyoLayout);
        tokyoLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


        //神奈川チェックボックス
        cityId += 1;
        kanagawaCheckBox = new CheckBox(getApplicationContext());
        kanagawaCheckBox.setId(cityId);
        kanagawaCheckBox.setText("神奈川県");
        LinearLayout.LayoutParams kanagawaCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        kanagawaCheckBox.setLayoutParams(kanagawaCheckBoxLayoutParams);
        kantoLayout.addView(kanagawaCheckBox);
        kanagawaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kanagawaLayout.setVisibility(View.VISIBLE);
            }
        });

//神奈川レイアウト
        kanagawaLayout = new LinearLayout(getApplicationContext());
        kanagawaLayout.setOrientation(LinearLayout.VERTICAL);
        kanagawaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kantoLayout.addView(kanagawaLayout);
        kanagawaLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);



//中部レイアウト
        i += 1;
        CheckBox checkBox3 = new CheckBox(getApplicationContext());
        checkBox3.setId(i);
        checkBox3.setText("中部地方");
        LinearLayout.LayoutParams checkBoxLayoutParams3 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        checkBox3.setLayoutParams(checkBoxLayoutParams3);
        layout.addView(checkBox3);
        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tyubuLayout.setVisibility(View.VISIBLE);
            }
        });
        tyubuLayout = new LinearLayout(getApplicationContext());
        tyubuLayout.setOrientation(LinearLayout.VERTICAL);
        tyubuLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tyubuLayout.setVisibility(View.GONE);
        layout.addView(tyubuLayout);


        //新潟チェックボックス
        cityId += 1;
        nigataCheckBox = new CheckBox(getApplicationContext());
        nigataCheckBox.setId(cityId);
        nigataCheckBox.setText("新潟県");
        LinearLayout.LayoutParams nigataCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        nigataCheckBox.setLayoutParams(nigataCheckBoxLayoutParams);
        tyubuLayout.addView(nigataCheckBox);
        nigataCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nigataLayout.setVisibility(View.VISIBLE);
            }
        });

//新潟レイアウト
        nigataLayout= new LinearLayout(getApplicationContext());
        nigataLayout.setOrientation(LinearLayout.VERTICAL);
        nigataLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tyubuLayout.addView(nigataLayout);
        nigataLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


//富山チェックボックス
        cityId += 1;
        toyamaCheckBox = new CheckBox(getApplicationContext());
        toyamaCheckBox.setId(cityId);
        toyamaCheckBox.setText("富山県");
        LinearLayout.LayoutParams toyamaCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        toyamaCheckBox.setLayoutParams(toyamaCheckBoxLayoutParams);
        tyubuLayout.addView(toyamaCheckBox);
        toyamaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toyamaLayout.setVisibility(View.VISIBLE);
            }
        });

//富山レイアウト
        toyamaLayout= new LinearLayout(getApplicationContext());
        toyamaLayout.setOrientation(LinearLayout.VERTICAL);
        toyamaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tyubuLayout.addView(toyamaLayout);
        toyamaLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


        //石川チェックボックス
        cityId += 1;
        ishikawaCheckBox = new CheckBox(getApplicationContext());
        ishikawaCheckBox.setId(cityId);
        ishikawaCheckBox.setText("石川県");
        LinearLayout.LayoutParams ishikawaCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        ishikawaCheckBox.setLayoutParams(ishikawaCheckBoxLayoutParams);
        tyubuLayout.addView(ishikawaCheckBox);
        ishikawaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ishikawaLayout.setVisibility(View.VISIBLE);
            }
        });

//石川レイアウト
        ishikawaLayout= new LinearLayout(getApplicationContext());
        ishikawaLayout.setOrientation(LinearLayout.VERTICAL);
        ishikawaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tyubuLayout.addView(ishikawaLayout);
        ishikawaLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);



        //福井チェックボックス
        cityId += 1;
        hukuiCheckBox = new CheckBox(getApplicationContext());
        hukuiCheckBox.setId(cityId);
        hukuiCheckBox.setText("福井県");
        LinearLayout.LayoutParams hukuiCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        hukuiCheckBox.setLayoutParams(hukuiCheckBoxLayoutParams);
        tyubuLayout.addView(hukuiCheckBox);
        hukuiCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hukuiLayout.setVisibility(View.VISIBLE);
            }
        });

//福井レイアウト
        hukuiLayout= new LinearLayout(getApplicationContext());
        hukuiLayout.setOrientation(LinearLayout.VERTICAL);
        hukuiLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tyubuLayout.addView(hukuiLayout);
        nigataLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);



        //山梨チェックボックス
        cityId += 1;
        yamanashiCheckBox = new CheckBox(getApplicationContext());
        yamanashiCheckBox.setId(cityId);
        yamanashiCheckBox.setText("山梨県");
        LinearLayout.LayoutParams yamanashiCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        yamanashiCheckBox.setLayoutParams(yamanashiCheckBoxLayoutParams);
        tyubuLayout.addView(yamanashiCheckBox);
        yamanashiCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yamanashiCheckBox.setVisibility(View.VISIBLE);
            }
        });

//山梨レイアウト
        yamanashiLayout= new LinearLayout(getApplicationContext());
        yamanashiLayout.setOrientation(LinearLayout.VERTICAL);
        yamanashiLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tyubuLayout.addView(yamanashiLayout);
        yamanashiLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);



        //長野チェックボックス
        cityId += 1;
        naganoCheckBox = new CheckBox(getApplicationContext());
        naganoCheckBox.setId(cityId);
        naganoCheckBox.setText("長野県");
        LinearLayout.LayoutParams naganoCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        naganoCheckBox.setLayoutParams(naganoCheckBoxLayoutParams);
        tyubuLayout.addView(naganoCheckBox);
        naganoCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                naganoLayout.setVisibility(View.VISIBLE);
            }
        });

//長野レイアウト
        naganoLayout= new LinearLayout(getApplicationContext());
        naganoLayout.setOrientation(LinearLayout.VERTICAL);
        naganoLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tyubuLayout.addView(naganoLayout);
        naganoLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);



        //岐阜チェックボックス
        cityId += 1;
        gihuCheckBox = new CheckBox(getApplicationContext());
        gihuCheckBox.setId(cityId);
        gihuCheckBox.setText("岐阜県");
        LinearLayout.LayoutParams gihuCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        gihuCheckBox.setLayoutParams(gihuCheckBoxLayoutParams);
        tyubuLayout.addView(gihuCheckBox);
        gihuCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gihuLayout.setVisibility(View.VISIBLE);
            }
        });

//岐阜レイアウト
        gihuLayout= new LinearLayout(getApplicationContext());
        gihuLayout.setOrientation(LinearLayout.VERTICAL);
        gihuLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tyubuLayout.addView(gihuLayout);
        gihuLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);



        //静岡チェックボックス
        cityId += 1;
        shizuokaCheckBox = new CheckBox(getApplicationContext());
        shizuokaCheckBox.setId(cityId);
        shizuokaCheckBox.setText("静岡県");
        LinearLayout.LayoutParams shizuokaCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        shizuokaCheckBox.setLayoutParams(shizuokaCheckBoxLayoutParams);
        tyubuLayout.addView(shizuokaCheckBox);
        shizuokaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shizuokaLayout.setVisibility(View.VISIBLE);
            }
        });

//静岡レイアウト
        shizuokaLayout= new LinearLayout(getApplicationContext());
        shizuokaLayout.setOrientation(LinearLayout.VERTICAL);
        shizuokaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tyubuLayout.addView(shizuokaLayout);
        shizuokaLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


        //愛知チェックボックス
        cityId += 1;
        aitiCheckBox = new CheckBox(getApplicationContext());
        aitiCheckBox.setId(cityId);
        aitiCheckBox.setText("愛知県");
        LinearLayout.LayoutParams aitiCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        aitiCheckBox.setLayoutParams(aitiCheckBoxLayoutParams);
        tyubuLayout.addView(aitiCheckBox);
        aitiCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aitiLayout.setVisibility(View.VISIBLE);
            }
        });

//愛知レイアウト
        aitiLayout= new LinearLayout(getApplicationContext());
        aitiLayout.setOrientation(LinearLayout.VERTICAL);
        aitiLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tyubuLayout.addView(aitiLayout);
        aitiLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


        i += 1;
        CheckBox checkBox4 = new CheckBox(getApplicationContext());
        checkBox4.setId(i);
        checkBox4.setText("近畿地方");
        LinearLayout.LayoutParams checkBoxLayoutParams4 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        checkBox4.setLayoutParams(checkBoxLayoutParams4);
        layout.addView(checkBox4);
        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kinkiLayout.setVisibility(View.VISIBLE);
            }
        });
        kinkiLayout = new LinearLayout(getApplicationContext());
        kinkiLayout.setOrientation(LinearLayout.VERTICAL);
        kinkiLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kinkiLayout.setVisibility(View.GONE);
        layout.addView(kinkiLayout);


        //三重チェックボックス
        cityId += 1;
        mieCheckBox = new CheckBox(getApplicationContext());
        mieCheckBox.setId(cityId);
        mieCheckBox.setText("三重県");
        LinearLayout.LayoutParams mieCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        mieCheckBox.setLayoutParams(mieCheckBoxLayoutParams);
        kinkiLayout.addView(mieCheckBox);
        mieCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mieLayout.setVisibility(View.VISIBLE);
            }
        });

//三重レイアウト
        mieLayout= new LinearLayout(getApplicationContext());
        mieLayout.setOrientation(LinearLayout.VERTICAL);
        mieLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kinkiLayout.addView(mieLayout);
        mieLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


//滋賀チェックボックス
        cityId += 1;
        shigaCheckBox = new CheckBox(getApplicationContext());
        shigaCheckBox.setId(cityId);
        shigaCheckBox.setText("滋賀県");
        LinearLayout.LayoutParams shigaCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        shigaCheckBox.setLayoutParams(shigaCheckBoxLayoutParams);
        kinkiLayout.addView(shigaCheckBox);
        shigaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shigaLayout.setVisibility(View.VISIBLE);
            }
        });

//滋賀レイアウト
        shigaLayout= new LinearLayout(getApplicationContext());
        shigaLayout.setOrientation(LinearLayout.VERTICAL);
        shigaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kinkiLayout.addView(shigaLayout);
        shigaLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);



        //京都チェックボックス
        cityId += 1;
        kyotoCheckBox = new CheckBox(getApplicationContext());
        kyotoCheckBox.setId(cityId);
        kyotoCheckBox.setText("京都府");
        LinearLayout.LayoutParams kyotoCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        kyotoCheckBox.setLayoutParams(kyotoCheckBoxLayoutParams);
        kinkiLayout.addView(kyotoCheckBox);
        kyotoCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kyotoLayout.setVisibility(View.VISIBLE);
            }
        });

//京都レイアウト
        kyotoLayout= new LinearLayout(getApplicationContext());
        kyotoLayout.setOrientation(LinearLayout.VERTICAL);
        kyotoLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kinkiLayout.addView(kyotoLayout);
        kyotoLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);



        //大阪チェックボックス
        cityId += 1;
        osakaCheckBox = new CheckBox(getApplicationContext());
        osakaCheckBox.setId(cityId);
        osakaCheckBox.setText("大阪府");
        LinearLayout.LayoutParams osakaCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        osakaCheckBox.setLayoutParams(osakaCheckBoxLayoutParams);
        kinkiLayout.addView(osakaCheckBox);
        osakaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                osakaLayout.setVisibility(View.VISIBLE);
            }
        });

//大阪レイアウト
        osakaLayout= new LinearLayout(getApplicationContext());
        osakaLayout.setOrientation(LinearLayout.VERTICAL);
        osakaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kinkiLayout.addView(osakaLayout);
        osakaLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);



        //兵庫チェックボックス
        cityId += 1;
        hyogoCheckBox = new CheckBox(getApplicationContext());
        hyogoCheckBox.setId(cityId);
        hyogoCheckBox.setText("兵庫県");
        LinearLayout.LayoutParams hyogoCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        hyogoCheckBox.setLayoutParams(hyogoCheckBoxLayoutParams);
        kinkiLayout.addView(hyogoCheckBox);
        hyogoCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hyogoLayout.setVisibility(View.VISIBLE);
            }
        });

//兵庫レイアウト
        hyogoLayout= new LinearLayout(getApplicationContext());
        hyogoLayout.setOrientation(LinearLayout.VERTICAL);
        hyogoLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kinkiLayout.addView(hyogoLayout);
        hyogoLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);



        //奈良チェックボックス
        cityId += 1;
        naraCheckBox = new CheckBox(getApplicationContext());
        naraCheckBox.setId(cityId);
        naraCheckBox.setText("奈良県");
        LinearLayout.LayoutParams naraCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        naraCheckBox.setLayoutParams(naraCheckBoxLayoutParams);
        kinkiLayout.addView(naraCheckBox);
        naraCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                naraLayout.setVisibility(View.VISIBLE);
            }
        });

//奈良レイアウト
        naraLayout= new LinearLayout(getApplicationContext());
        naraLayout.setOrientation(LinearLayout.VERTICAL);
        naraLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kinkiLayout.addView(naraLayout);
        naraLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);



        //和歌山チェックボックス
        cityId += 1;
        wakayamaCheckBox = new CheckBox(getApplicationContext());
        wakayamaCheckBox.setId(cityId);
        wakayamaCheckBox.setText("和歌山県");
        LinearLayout.LayoutParams wakayamaCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        wakayamaCheckBox.setLayoutParams(wakayamaCheckBoxLayoutParams);
        kinkiLayout.addView(wakayamaCheckBox);
        wakayamaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wakayamaLayout.setVisibility(View.VISIBLE);
            }
        });

//和歌山レイアウト
        wakayamaLayout= new LinearLayout(getApplicationContext());
        wakayamaLayout.setOrientation(LinearLayout.VERTICAL);
        wakayamaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kinkiLayout.addView(wakayamaLayout);
        wakayamaLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


//中国地方
        i += 1;
        CheckBox checkBox5 = new CheckBox(getApplicationContext());
        checkBox5.setId(i);
        checkBox5.setText("中国地方");
        LinearLayout.LayoutParams checkBoxLayoutParams5 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        checkBox5.setLayoutParams(checkBoxLayoutParams5);
        layout.addView(checkBox5);
        checkBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tyugokuLayout.setVisibility(View.VISIBLE);
            }
        });
        tyugokuLayout = new LinearLayout(getApplicationContext());
        tyugokuLayout.setOrientation(LinearLayout.VERTICAL);
        tyugokuLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tyugokuLayout.setVisibility(View.GONE);
        layout.addView(tyugokuLayout);


        //鳥取チェックボックス
        cityId += 1;
        tottoriCheckBox = new CheckBox(getApplicationContext());
        tottoriCheckBox.setId(cityId);
        tottoriCheckBox.setText("鳥取県");
        LinearLayout.LayoutParams tottoriCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        tottoriCheckBox.setLayoutParams(tottoriCheckBoxLayoutParams);
        tyugokuLayout.addView(tottoriCheckBox);
        tottoriCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tottoriLayout.setVisibility(View.VISIBLE);
            }
        });

//鳥取レイアウト
        tottoriLayout= new LinearLayout(getApplicationContext());
        tottoriLayout.setOrientation(LinearLayout.VERTICAL);
        tottoriLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tyugokuLayout.addView(tottoriLayout);
        tottoriLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


        //島根チェックボックス
        cityId += 1;
        shimaneCheckBox = new CheckBox(getApplicationContext());
        shimaneCheckBox.setId(cityId);
        shimaneCheckBox.setText("島根県");
        LinearLayout.LayoutParams shimaneCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        shimaneCheckBox.setLayoutParams(shimaneCheckBoxLayoutParams);
        kinkiLayout.addView(shimaneCheckBox);
        shimaneCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shimaneLayout.setVisibility(View.VISIBLE);
            }
        });

//島根レイアウト
        shimaneLayout= new LinearLayout(getApplicationContext());
        shimaneLayout.setOrientation(LinearLayout.VERTICAL);
        shimaneLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kinkiLayout.addView(shimaneLayout);
        shimaneLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


        //岡山チェックボックス
        cityId += 1;
        okayamaCheckBox = new CheckBox(getApplicationContext());
        okayamaCheckBox.setId(cityId);
        okayamaCheckBox.setText("岡山県");
        LinearLayout.LayoutParams okayamaCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        okayamaCheckBox.setLayoutParams(okayamaCheckBoxLayoutParams);
        tyugokuLayout.addView(okayamaCheckBox);
        okayamaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                okayamaLayout.setVisibility(View.VISIBLE);
            }
        });

//岡山レイアウト
        okayamaLayout= new LinearLayout(getApplicationContext());
        okayamaLayout.setOrientation(LinearLayout.VERTICAL);
        okayamaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tyugokuLayout.addView(okayamaLayout);
        okayamaLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


        //広島チェックボックス
        cityId += 1;
        hiroshimaCheckBox = new CheckBox(getApplicationContext());
        hiroshimaCheckBox.setId(cityId);
        hiroshimaCheckBox.setText("広島県");
        LinearLayout.LayoutParams hiroshimaCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        hiroshimaCheckBox.setLayoutParams(hiroshimaCheckBoxLayoutParams);
        tyugokuLayout.addView(hiroshimaCheckBox);
        hiroshimaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hiroshimaLayout.setVisibility(View.VISIBLE);
            }
        });

//広島レイアウト
        hiroshimaLayout= new LinearLayout(getApplicationContext());
        hiroshimaLayout.setOrientation(LinearLayout.VERTICAL);
        hiroshimaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tyugokuLayout.addView(hiroshimaLayout);
        hiroshimaLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


        //山口チェックボックス
        cityId += 1;
        yamaguchiCheckBox = new CheckBox(getApplicationContext());
        yamaguchiCheckBox.setId(cityId);
        yamaguchiCheckBox.setText("山口県");
        LinearLayout.LayoutParams yamaguchiCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        yamaguchiCheckBox.setLayoutParams(yamaguchiCheckBoxLayoutParams);
        tyugokuLayout.addView(yamaguchiCheckBox);
        yamaguchiCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yamaguchiLayout.setVisibility(View.VISIBLE);
            }
        });

//山口レイアウト
        yamaguchiLayout= new LinearLayout(getApplicationContext());
        yamaguchiLayout.setOrientation(LinearLayout.VERTICAL);
        yamaguchiLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tyugokuLayout.addView(yamaguchiLayout);
        yamaguchiLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


//四国レイアウト
        i += 1;
        CheckBox checkBox6 = new CheckBox(getApplicationContext());
        checkBox6.setId(i);
        checkBox6.setText("四国地方");
        LinearLayout.LayoutParams checkBoxLayoutParams6 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        checkBox6.setLayoutParams(checkBoxLayoutParams6);
        layout.addView(checkBox6);
        checkBox6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shikokuLayout.setVisibility(View.VISIBLE);
            }
        });
        shikokuLayout = new LinearLayout(getApplicationContext());
        shikokuLayout.setOrientation(LinearLayout.VERTICAL);
        shikokuLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        shikokuLayout.setVisibility(View.GONE);
        layout.addView(shikokuLayout);


        //徳島チェックボックス
        cityId += 1;
        tokushimaCheckBox = new CheckBox(getApplicationContext());
        tokushimaCheckBox.setId(cityId);
        tokushimaCheckBox.setText("徳島県");
        LinearLayout.LayoutParams tokushimaCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        tokushimaCheckBox.setLayoutParams(tokushimaCheckBoxLayoutParams);
        shikokuLayout.addView(tokushimaCheckBox);
        tokushimaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tokushimaLayout.setVisibility(View.VISIBLE);
            }
        });

//徳島レイアウト
        tokushimaLayout= new LinearLayout(getApplicationContext());
        tokushimaLayout.setOrientation(LinearLayout.VERTICAL);
        tokushimaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        shikokuLayout.addView(tokushimaLayout);
        tokushimaLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


        //香川チェックボックス
        cityId += 1;
        kagawaCheckBox = new CheckBox(getApplicationContext());
        kagawaCheckBox.setId(cityId);
        kagawaCheckBox.setText("香川県");
        LinearLayout.LayoutParams kagawaCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        kagawaCheckBox.setLayoutParams(kagawaCheckBoxLayoutParams);
        shikokuLayout.addView(kagawaCheckBox);
        kagawaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kagawaLayout.setVisibility(View.VISIBLE);
            }
        });

//香川レイアウト
        kagawaLayout= new LinearLayout(getApplicationContext());
        kagawaLayout.setOrientation(LinearLayout.VERTICAL);
        kagawaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        shikokuLayout.addView(kagawaLayout);
        kagawaLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


        //愛媛チェックボックス
        cityId += 1;
        ehimeCheckBox = new CheckBox(getApplicationContext());
        ehimeCheckBox.setId(cityId);
        ehimeCheckBox.setText("愛媛県");
        LinearLayout.LayoutParams ehimeCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        ehimeCheckBox.setLayoutParams(ehimeCheckBoxLayoutParams);
        shikokuLayout.addView(ehimeCheckBox);
        ehimeCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ehimeLayout.setVisibility(View.VISIBLE);
            }
        });

//愛媛レイアウト
        ehimeLayout= new LinearLayout(getApplicationContext());
        ehimeLayout.setOrientation(LinearLayout.VERTICAL);
        ehimeLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        shikokuLayout.addView(ehimeLayout);
        ehimeLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


        //高知チェックボックス
        cityId += 1;
        kochiCheckBox = new CheckBox(getApplicationContext());
        kochiCheckBox.setId(cityId);
        kochiCheckBox.setText("高知県");
        LinearLayout.LayoutParams kochiCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        kochiCheckBox.setLayoutParams(kochiCheckBoxLayoutParams);
        shikokuLayout.addView(kochiCheckBox);
        kochiCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kochiLayout.setVisibility(View.VISIBLE);
            }
        });

//高知レイアウト
        kochiLayout= new LinearLayout(getApplicationContext());
        kochiLayout.setOrientation(LinearLayout.VERTICAL);
        kochiLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        shikokuLayout.addView(kochiLayout);
        kochiLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


//九州レイアウト
        i += 1;
        CheckBox checkBox7 = new CheckBox(getApplicationContext());
        checkBox7.setId(i);
        checkBox7.setText("九州地方");

        LinearLayout.LayoutParams checkBoxLayoutParams7 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        checkBox7.setLayoutParams(checkBoxLayoutParams7);
        layout.addView(checkBox7);
        checkBox7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kyusyuLayout.setVisibility(View.VISIBLE);
            }
        });
        kyusyuLayout = new LinearLayout(getApplicationContext());
        kyusyuLayout.setOrientation(LinearLayout.VERTICAL);
        kyusyuLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kyusyuLayout.setVisibility(View.GONE);
        layout.addView(kyusyuLayout);


        //福岡チェックボックス
        cityId += 1;
        hukuokaCheckBox = new CheckBox(getApplicationContext());
        hukuokaCheckBox.setId(cityId);
        hukuokaCheckBox.setText("福岡県");
        LinearLayout.LayoutParams hukuokaCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        hukuokaCheckBox.setLayoutParams(hukuokaCheckBoxLayoutParams);
        kyusyuLayout.addView(hukuokaCheckBox);
        hukuokaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hukuokaLayout.setVisibility(View.VISIBLE);
            }
        });

//福岡レイアウト
        hukuokaLayout= new LinearLayout(getApplicationContext());
        hukuokaLayout.setOrientation(LinearLayout.VERTICAL);
        hukuokaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kyusyuLayout.addView(hukuokaLayout);
        hukuokaLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


        //佐賀チェックボックス
        cityId += 1;
        sagaCheckBox= new CheckBox(getApplicationContext());
        sagaCheckBox.setId(cityId);
        sagaCheckBox.setText("佐賀県");
        LinearLayout.LayoutParams sagaCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        sagaCheckBox.setLayoutParams(sagaCheckBoxLayoutParams);
        kyusyuLayout.addView(sagaCheckBox);
        sagaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sagaLayout.setVisibility(View.VISIBLE);
            }
        });

//佐賀レイアウト
        sagaLayout= new LinearLayout(getApplicationContext());
        sagaLayout.setOrientation(LinearLayout.VERTICAL);
        sagaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kyusyuLayout.addView(sagaLayout);
        sagaLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


        //長崎チェックボックス
        cityId += 1;
        nagasakiCheckBox = new CheckBox(getApplicationContext());
        nagasakiCheckBox.setId(cityId);
        nagasakiCheckBox.setText("長崎県");
        LinearLayout.LayoutParams nagasakiCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        nagasakiCheckBox.setLayoutParams(nagasakiCheckBoxLayoutParams);
        kyusyuLayout.addView(nagasakiCheckBox);
        nagasakiCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nagasakiLayout.setVisibility(View.VISIBLE);
            }
        });

//長崎レイアウト
        nagasakiLayout= new LinearLayout(getApplicationContext());
        nagasakiLayout.setOrientation(LinearLayout.VERTICAL);
        nagasakiLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kyusyuLayout.addView(nagasakiLayout);
        nagasakiLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


        //熊本チェックボックス
        cityId += 1;
        kumamotoCheckBox = new CheckBox(getApplicationContext());
        kumamotoCheckBox.setId(cityId);
        kumamotoCheckBox.setText("熊本県");
        LinearLayout.LayoutParams kumamotoCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        kumamotoCheckBox.setLayoutParams(kumamotoCheckBoxLayoutParams);
        kyusyuLayout.addView(kumamotoCheckBox);
        kumamotoCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kumamotoLayout.setVisibility(View.VISIBLE);
            }
        });

//熊本レイアウト
        kumamotoLayout= new LinearLayout(getApplicationContext());
        kumamotoLayout.setOrientation(LinearLayout.VERTICAL);
        kumamotoLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kyusyuLayout.addView(kumamotoLayout);
        kumamotoLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


        //大分チェックボックス
        cityId += 1;
        oitaCheckBox = new CheckBox(getApplicationContext());
        oitaCheckBox.setId(cityId);
        oitaCheckBox.setText("大分県");
        LinearLayout.LayoutParams oitaCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        oitaCheckBox.setLayoutParams(oitaCheckBoxLayoutParams);
        kyusyuLayout.addView(oitaCheckBox);
        oitaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oitaLayout.setVisibility(View.VISIBLE);
            }
        });

//大分レイアウト
        oitaLayout= new LinearLayout(getApplicationContext());
        oitaLayout.setOrientation(LinearLayout.VERTICAL);
        oitaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kyusyuLayout.addView(oitaLayout);
        oitaLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


        //宮崎チェックボックス
        cityId += 1;
        miyazakiCheckBox = new CheckBox(getApplicationContext());
        miyazakiCheckBox.setId(cityId);
        miyazakiCheckBox.setText("宮崎県");
        LinearLayout.LayoutParams miyazakiCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        miyazakiCheckBox.setLayoutParams(miyazakiCheckBoxLayoutParams);
        kyusyuLayout.addView(miyazakiCheckBox);
        miyazakiCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                miyazakiLayout.setVisibility(View.VISIBLE);
            }
        });

//宮崎レイアウト
        miyazakiLayout= new LinearLayout(getApplicationContext());
        miyazakiLayout.setOrientation(LinearLayout.VERTICAL);
        miyazakiLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kyusyuLayout.addView(miyazakiLayout);
        miyazakiLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);



        //鹿児島チェックボックス
        cityId += 1;
        kagoshimaCheckBox = new CheckBox(getApplicationContext());
        kagoshimaCheckBox.setId(cityId);
        kagoshimaCheckBox.setText("鹿児島県");
        LinearLayout.LayoutParams kagoshimaCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        kagoshimaCheckBox.setLayoutParams(kagoshimaCheckBoxLayoutParams);
        kyusyuLayout.addView(kagoshimaCheckBox);
        kagoshimaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kagoshimaLayout.setVisibility(View.VISIBLE);
            }
        });

//鹿児島レイアウト
        kagoshimaLayout= new LinearLayout(getApplicationContext());
        kagoshimaLayout.setOrientation(LinearLayout.VERTICAL);
        kagoshimaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kyusyuLayout.addView(kagoshimaLayout);
        kagoshimaLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


        //沖縄チェックボックス
        cityId += 1;
        okinawaCheckBox = new CheckBox(getApplicationContext());
        okinawaCheckBox.setId(cityId);
        okinawaCheckBox.setText("沖縄県");
        LinearLayout.LayoutParams okinawaCheckBoxLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        okinawaCheckBox.setLayoutParams(okinawaCheckBoxLayoutParams);
        kyusyuLayout.addView(okinawaCheckBox);
        okinawaCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                okinawaLayout.setVisibility(View.VISIBLE);
            }
        });

//沖縄レイアウト
        okinawaLayout= new LinearLayout(getApplicationContext());
        okinawaLayout.setOrientation(LinearLayout.VERTICAL);
        okinawaLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        kyusyuLayout.addView(okinawaLayout);
        okinawaLayout.setVisibility(View.GONE);

        areaId = String.valueOf(cityId);
        new ApiTask().execute(areaId);


    }
}