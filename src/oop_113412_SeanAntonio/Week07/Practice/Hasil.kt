package oop_113412_SeanAntonio.Week07.Practice

sealed class Hasil {
    data class sukses(val data: String) : Hasil();
    data class error(val ex: Exception) : Hasil();
    object Loading : Hasil();

    fun handle_response(res: Hasil) {
        when (res) {
            is sukses -> { println("Sukses lempar data")}
            is error -> { println("Error ${res.ex}")}
            Loading -> {println("Loading...")}
        }
    }

}