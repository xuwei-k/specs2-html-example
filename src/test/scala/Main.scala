package com.github.xuwei_k

import org.specs2.Specification

class Main extends Specification { def is = noindent ^
  "Specs2 Html Output Example".title ^ 
"""

### Specs2 つかって Html 出力してみたお（ ＾ω＾）

* [specs2](https://github.com/etorreborre/specs2/) っていうテストライブラリのUser Guide 眺める

* へー [html 吐き出せる機能](http://etorreborre.github.com/specs2/guide/org.specs2.guide.Runners.html#Html+output)があるのかーちょっとためしてみよう(｀・ω・´)

* おーできた＼(^o^)／ あれ、この html の感じ、どこかで見たことが(・ω・｀)?

* そういえば、Specs2のUser Guide のそれぞれのページの下に、なにやら実行時間が記録されたような謎の記述ががががが

![User Guide](http://cdn-ak.f.st-hatena.com/images/fotolife/x/xuwei/20110911/20110911190550.png?1315735627)

* こっこれは・・・  https://github.com/etorreborre/specs2/blob/1.6/src/test/scala/org/specs2/guide/SpecStructure.scala

* つまり Specs2 は Users Guide 自体を Specs2 によって生成している。なにを言っているか分からないと思うが(ry

* というわけで、これ Specs2 で生成してみましたうぉーーー(｀・ω・´)/

* [このあたり見てもらえばわかりますが](http://etorreborre.github.com/specs2/guide/org.specs2.guide.Runners.html) 色々な結果をhtmlで出力するために、markdown形式で記述できるようになってるらしいです

""" ^ end

}
