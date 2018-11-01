package by.epamcourses.entity;

public class PunctuationMark implements ReturnAsString {
 private  String punctchar;

public PunctuationMark(String punctchar) {
    this.punctchar = punctchar;
}

public String getPunctchar() {
    return punctchar;
}


@Override
public String returnAsString( ) {
    return punctchar;
}

}
