import java.util.HashMap;

class RnaTranscription {
    String transcribe(String dnaStrand) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('G', 'C');
        map.put('C', 'G');
        map.put('T', 'A');
        map.put('A', 'U');
        String res = "";
        for (int i = 0; i < dnaStrand.length(); i++) {
            res = res+map.get(dnaStrand.charAt(i));
        }
        return res;
    }
}
