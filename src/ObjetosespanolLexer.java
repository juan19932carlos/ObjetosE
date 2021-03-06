// Generated from Objetosespanol.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ObjetosespanolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, OP_OR=17, 
		OP_AND=18, OP_NOT=19, OP_MAS=20, OP_MENOS=21, OP_MULTI=22, OP_DIV=23, 
		NOMBRE=24, NUMERO=25, ENDL=26, BASURA=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "OP_OR", 
		"OP_AND", "OP_NOT", "OP_MAS", "OP_MENOS", "OP_MULTI", "OP_DIV", "NOMBRE", 
		"NUMERO", "ENDL", "BASURA"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'clase'", "'{'", "'}'", "'def'", "'('", "','", "')'", "'='", "'si'", 
		"'sino'", "'mientras'", "'<'", "'<='", "'>='", "'>'", "'=='", "'o'", "'y'", 
		"'no'", "'+'", "'-'", "'*'", "'/'", null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "OP_OR", "OP_AND", "OP_NOT", "OP_MAS", "OP_MENOS", 
		"OP_MULTI", "OP_DIV", "NOMBRE", "NUMERO", "ENDL", "BASURA"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ObjetosespanolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Objetosespanol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00a4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\7\31"+
		"\177\n\31\f\31\16\31\u0082\13\31\3\32\6\32\u0085\n\32\r\32\16\32\u0086"+
		"\3\32\3\32\6\32\u008b\n\32\r\32\16\32\u008c\5\32\u008f\n\32\3\32\3\32"+
		"\5\32\u0093\n\32\3\32\6\32\u0096\n\32\r\32\16\32\u0097\5\32\u009a\n\32"+
		"\3\33\3\33\3\34\6\34\u009f\n\34\r\34\16\34\u00a0\3\34\3\34\2\2\35\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\b\4\2C\\"+
		"c|\5\2\62;C\\c|\3\2\62;\4\2GGgg\4\2--//\6\2\13\f\17\17\"\"))\u00ab\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5?\3\2\2"+
		"\2\7A\3\2\2\2\tC\3\2\2\2\13G\3\2\2\2\rI\3\2\2\2\17K\3\2\2\2\21M\3\2\2"+
		"\2\23O\3\2\2\2\25R\3\2\2\2\27W\3\2\2\2\31`\3\2\2\2\33b\3\2\2\2\35e\3\2"+
		"\2\2\37h\3\2\2\2!j\3\2\2\2#m\3\2\2\2%o\3\2\2\2\'q\3\2\2\2)t\3\2\2\2+v"+
		"\3\2\2\2-x\3\2\2\2/z\3\2\2\2\61|\3\2\2\2\63\u0084\3\2\2\2\65\u009b\3\2"+
		"\2\2\67\u009e\3\2\2\29:\7e\2\2:;\7n\2\2;<\7c\2\2<=\7u\2\2=>\7g\2\2>\4"+
		"\3\2\2\2?@\7}\2\2@\6\3\2\2\2AB\7\177\2\2B\b\3\2\2\2CD\7f\2\2DE\7g\2\2"+
		"EF\7h\2\2F\n\3\2\2\2GH\7*\2\2H\f\3\2\2\2IJ\7.\2\2J\16\3\2\2\2KL\7+\2\2"+
		"L\20\3\2\2\2MN\7?\2\2N\22\3\2\2\2OP\7u\2\2PQ\7k\2\2Q\24\3\2\2\2RS\7u\2"+
		"\2ST\7k\2\2TU\7p\2\2UV\7q\2\2V\26\3\2\2\2WX\7o\2\2XY\7k\2\2YZ\7g\2\2Z"+
		"[\7p\2\2[\\\7v\2\2\\]\7t\2\2]^\7c\2\2^_\7u\2\2_\30\3\2\2\2`a\7>\2\2a\32"+
		"\3\2\2\2bc\7>\2\2cd\7?\2\2d\34\3\2\2\2ef\7@\2\2fg\7?\2\2g\36\3\2\2\2h"+
		"i\7@\2\2i \3\2\2\2jk\7?\2\2kl\7?\2\2l\"\3\2\2\2mn\7q\2\2n$\3\2\2\2op\7"+
		"{\2\2p&\3\2\2\2qr\7p\2\2rs\7q\2\2s(\3\2\2\2tu\7-\2\2u*\3\2\2\2vw\7/\2"+
		"\2w,\3\2\2\2xy\7,\2\2y.\3\2\2\2z{\7\61\2\2{\60\3\2\2\2|\u0080\t\2\2\2"+
		"}\177\t\3\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\62\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\t\4\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u008e\3\2\2\2\u0088\u008a\7\60\2\2\u0089\u008b\t\4\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008f\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0099\3\2\2\2\u0090\u0092\t\5\2\2\u0091\u0093\t\6\2\2\u0092\u0091\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0096\t\4\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u009a\3\2\2\2\u0099\u0090\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\64\3\2\2\2\u009b\u009c\7=\2\2\u009c\66\3\2\2\2\u009d\u009f\t\7\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\b\34\2\2\u00a38\3\2\2\2\13\2\u0080"+
		"\u0086\u008c\u008e\u0092\u0097\u0099\u00a0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}