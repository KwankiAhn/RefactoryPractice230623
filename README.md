# RefactoryPractice230623

## Before
![image](https://github.com/KwankiAhn/RefactoryPractice230623/assets/18159523/882e148a-34af-4697-be32-22633cf0d5f4)

<pre><code>
  Metric id="VG" description="McCabe Cyclomatic Complexity" max="10" hint="use Extract-method to split the method up"
  Values per="method" avg="1.471" stddev="1.882" max="9"
  Metric id="LCOM" description="Lack of Cohesion of Methods
  Values per="type" avg="0.367" stddev="0.306" max="0.667"
</code></pre>

## After
<pre><code>
  Metric id="VG" description="McCabe Cyclomatic Complexity" max="10" hint="use Extract-method to split the method up"
  Values per="method" avg="1.4" stddev="0.748" max="4"
  Metric id="LCOM" description="Lack of Cohesion of Methods
  Values per="type" avg="0.221" stddev="0.288" max="0.667"
</code></pre>

## 실행 시간 추적 (유닛 테스트 수행 시간)
<pre><code>
0.086
0.105 // calcLineAmount(rent) 의 중복 호출
0.113
0.086 // String rentalList = calcRentalList(totalAmount, bonusPoints);
0.083 // xxxMovieType 확장
0.039 // finish 0.9
</code></pre>
