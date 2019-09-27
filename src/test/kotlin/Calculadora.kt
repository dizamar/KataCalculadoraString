//import com.univocity.parsers.conversions.Conversions.string

class Calculadora {
    fun suma(s:String=""): Int {
        if(s.isNullOrEmpty())
            return 0
        if(s.contains(","))
        {val parts = s.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            if(parts.size==2)
                return (parts[0].toInt()+parts[1].toInt())
            else
            {
                var sum=0
                for (i in 0..parts.size-1) {
                    sum = sum + parts[i].toInt()
                }
                return sum
            }
        }
        if(s.contains("v")){
            val part = s.split("v")
            var sum1=0
            for (i in 0..part.size-1) {
                sum1 = sum1 + part[i].toInt()
            }
            return sum1
        }
        if(s.contains("")){
        var line = System.getProperty("line.separator")
            val parts = s.split("-", "$line")
            var sum0=0
            for (i in 0..parts.size-1) {
                sum0 = sum0 + parts[i].toInt()
            }

    }


        return s.toInt()
}
}
