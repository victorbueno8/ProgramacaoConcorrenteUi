package br.edu.ifsp.scl.programacaoconcorrenteui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.edu.ifsp.scl.programacaoconcorrenteui.ProgramacaoConcorrenteActivity.Constantes.CARREGA_IMAGENS_DELAY
import kotlinx.android.synthetic.main.activity_programacao_concorrente.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.lang.Thread.sleep

class CoroutinesActivity : ProgramacaoConcorrenteActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_coroutines)
        supportActionBar?.title = "Coroutines"
    }

    override fun run() {
        GlobalScope.launch {
            sleep(CARREGA_IMAGENS_DELAY)

            runOnUiThread {
                altaIv.setImageResource(R.drawable.android_preto)
                baixaIv.setImageResource(R.drawable.android_verde)
            }
        }
    }

}
