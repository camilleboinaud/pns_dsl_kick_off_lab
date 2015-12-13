/*
 * generated by Xtext
 */
package arduinoML.concretesyntax.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import arduinoML.concretesyntax.services.ArduinoMLGrammarAccess;

public class ArduinoMLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ArduinoMLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected arduinoML.concretesyntax.parser.antlr.internal.InternalArduinoMLParser createParser(XtextTokenStream stream) {
		return new arduinoML.concretesyntax.parser.antlr.internal.InternalArduinoMLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "App";
	}
	
	public ArduinoMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ArduinoMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
