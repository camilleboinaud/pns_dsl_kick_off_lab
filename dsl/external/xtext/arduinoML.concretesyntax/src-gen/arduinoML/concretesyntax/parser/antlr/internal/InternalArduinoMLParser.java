package arduinoML.concretesyntax.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import arduinoML.concretesyntax.services.ArduinoMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArduinoMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'app'", "'initial'", "'{'", "'bricks'", "'}'", "'states'", "':'", "'-'", "'sensor'", "'actuator'", "'set'", "'to'", "'if'", "'is'", "'move to'", "'high'", "'low'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalArduinoMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalArduinoMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalArduinoMLParser.tokenNames; }
    public String getGrammarFileName() { return "../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g"; }



     	private ArduinoMLGrammarAccess grammarAccess;
     	
        public InternalArduinoMLParser(TokenStream input, ArduinoMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "App";	
       	}
       	
       	@Override
       	protected ArduinoMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleApp"
    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:68:1: entryRuleApp returns [EObject current=null] : iv_ruleApp= ruleApp EOF ;
    public final EObject entryRuleApp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApp = null;


        try {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:69:2: (iv_ruleApp= ruleApp EOF )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:70:2: iv_ruleApp= ruleApp EOF
            {
             newCompositeNode(grammarAccess.getAppRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleApp_in_entryRuleApp75);
            iv_ruleApp=ruleApp();

            state._fsp--;

             current =iv_ruleApp; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleApp85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApp"


    // $ANTLR start "ruleApp"
    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:77:1: ruleApp returns [EObject current=null] : (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial' ( ( ruleEString ) ) otherlv_4= '{' otherlv_5= 'bricks' otherlv_6= '{' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* otherlv_9= '}' otherlv_10= 'states' otherlv_11= '{' ( (lv_states_12_0= ruleState ) ) ( (lv_states_13_0= ruleState ) )* otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleApp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_bricks_7_0 = null;

        EObject lv_bricks_8_0 = null;

        EObject lv_states_12_0 = null;

        EObject lv_states_13_0 = null;


         enterRule(); 
            
        try {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:80:28: ( (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial' ( ( ruleEString ) ) otherlv_4= '{' otherlv_5= 'bricks' otherlv_6= '{' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* otherlv_9= '}' otherlv_10= 'states' otherlv_11= '{' ( (lv_states_12_0= ruleState ) ) ( (lv_states_13_0= ruleState ) )* otherlv_14= '}' otherlv_15= '}' ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:81:1: (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial' ( ( ruleEString ) ) otherlv_4= '{' otherlv_5= 'bricks' otherlv_6= '{' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* otherlv_9= '}' otherlv_10= 'states' otherlv_11= '{' ( (lv_states_12_0= ruleState ) ) ( (lv_states_13_0= ruleState ) )* otherlv_14= '}' otherlv_15= '}' )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:81:1: (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial' ( ( ruleEString ) ) otherlv_4= '{' otherlv_5= 'bricks' otherlv_6= '{' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* otherlv_9= '}' otherlv_10= 'states' otherlv_11= '{' ( (lv_states_12_0= ruleState ) ) ( (lv_states_13_0= ruleState ) )* otherlv_14= '}' otherlv_15= '}' )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:81:3: otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial' ( ( ruleEString ) ) otherlv_4= '{' otherlv_5= 'bricks' otherlv_6= '{' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* otherlv_9= '}' otherlv_10= 'states' otherlv_11= '{' ( (lv_states_12_0= ruleState ) ) ( (lv_states_13_0= ruleState ) )* otherlv_14= '}' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleApp122); 

                	newLeafNode(otherlv_0, grammarAccess.getAppAccess().getAppKeyword_0());
                
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:85:1: ( (lv_name_1_0= ruleEString ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:86:1: (lv_name_1_0= ruleEString )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:86:1: (lv_name_1_0= ruleEString )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:87:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleApp143);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAppRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleApp155); 

                	newLeafNode(otherlv_2, grammarAccess.getAppAccess().getInitialKeyword_2());
                
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:107:1: ( ( ruleEString ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:108:1: ( ruleEString )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:108:1: ( ruleEString )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:109:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAppRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAppAccess().getInitialStateCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleApp178);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleApp190); 

                	newLeafNode(otherlv_4, grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleApp202); 

                	newLeafNode(otherlv_5, grammarAccess.getAppAccess().getBricksKeyword_5());
                
            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleApp214); 

                	newLeafNode(otherlv_6, grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_6());
                
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:134:1: ( (lv_bricks_7_0= ruleBrick ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:135:1: (lv_bricks_7_0= ruleBrick )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:135:1: (lv_bricks_7_0= ruleBrick )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:136:3: lv_bricks_7_0= ruleBrick
            {
             
            	        newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBrick_in_ruleApp235);
            lv_bricks_7_0=ruleBrick();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAppRule());
            	        }
                   		add(
                   			current, 
                   			"bricks",
                    		lv_bricks_7_0, 
                    		"Brick");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:152:2: ( (lv_bricks_8_0= ruleBrick ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=19 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:153:1: (lv_bricks_8_0= ruleBrick )
            	    {
            	    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:153:1: (lv_bricks_8_0= ruleBrick )
            	    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:154:3: lv_bricks_8_0= ruleBrick
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBrick_in_ruleApp256);
            	    lv_bricks_8_0=ruleBrick();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAppRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"bricks",
            	            		lv_bricks_8_0, 
            	            		"Brick");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleApp269); 

                	newLeafNode(otherlv_9, grammarAccess.getAppAccess().getRightCurlyBracketKeyword_9());
                
            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleApp281); 

                	newLeafNode(otherlv_10, grammarAccess.getAppAccess().getStatesKeyword_10());
                
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleApp293); 

                	newLeafNode(otherlv_11, grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_11());
                
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:182:1: ( (lv_states_12_0= ruleState ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:183:1: (lv_states_12_0= ruleState )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:183:1: (lv_states_12_0= ruleState )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:184:3: lv_states_12_0= ruleState
            {
             
            	        newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleApp314);
            lv_states_12_0=ruleState();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAppRule());
            	        }
                   		add(
                   			current, 
                   			"states",
                    		lv_states_12_0, 
                    		"State");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:200:2: ( (lv_states_13_0= ruleState ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:201:1: (lv_states_13_0= ruleState )
            	    {
            	    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:201:1: (lv_states_13_0= ruleState )
            	    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:202:3: lv_states_13_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleApp335);
            	    lv_states_13_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAppRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_13_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleApp348); 

                	newLeafNode(otherlv_14, grammarAccess.getAppAccess().getRightCurlyBracketKeyword_14());
                
            otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleApp360); 

                	newLeafNode(otherlv_15, grammarAccess.getAppAccess().getRightCurlyBracketKeyword_15());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApp"


    // $ANTLR start "entryRuleBrick"
    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:234:1: entryRuleBrick returns [EObject current=null] : iv_ruleBrick= ruleBrick EOF ;
    public final EObject entryRuleBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrick = null;


        try {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:235:2: (iv_ruleBrick= ruleBrick EOF )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:236:2: iv_ruleBrick= ruleBrick EOF
            {
             newCompositeNode(grammarAccess.getBrickRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBrick_in_entryRuleBrick396);
            iv_ruleBrick=ruleBrick();

            state._fsp--;

             current =iv_ruleBrick; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBrick406); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBrick"


    // $ANTLR start "ruleBrick"
    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:243:1: ruleBrick returns [EObject current=null] : ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) ) ;
    public final EObject ruleBrick() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_Sensor_0 = null;

        EObject this_Actuator_1 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_pin_4_0 = null;


         enterRule(); 
            
        try {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:246:28: ( ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:247:1: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:247:1: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:247:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:247:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:248:5: this_Sensor_0= ruleSensor
                    {
                     
                            newCompositeNode(grammarAccess.getBrickAccess().getSensorParserRuleCall_0_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleBrick454);
                    this_Sensor_0=ruleSensor();

                    state._fsp--;

                     
                            current = this_Sensor_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:258:5: this_Actuator_1= ruleActuator
                    {
                     
                            newCompositeNode(grammarAccess.getBrickAccess().getActuatorParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleBrick481);
                    this_Actuator_1=ruleActuator();

                    state._fsp--;

                     
                            current = this_Actuator_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:266:2: ( (lv_name_2_0= ruleEString ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:267:1: (lv_name_2_0= ruleEString )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:267:1: (lv_name_2_0= ruleEString )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:268:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBrick502);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBrickRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBrick514); 

                	newLeafNode(otherlv_3, grammarAccess.getBrickAccess().getColonKeyword_2());
                
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:288:1: ( (lv_pin_4_0= ruleEInt ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:289:1: (lv_pin_4_0= ruleEInt )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:289:1: (lv_pin_4_0= ruleEInt )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:290:3: lv_pin_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBrick535);
            lv_pin_4_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBrickRule());
            	        }
                   		set(
                   			current, 
                   			"pin",
                    		lv_pin_4_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBrick"


    // $ANTLR start "entryRuleEString"
    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:314:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:315:2: (iv_ruleEString= ruleEString EOF )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:316:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString572);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString583); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:323:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:326:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:327:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:327:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:327:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString623); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:335:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString649); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleState"
    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:350:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:351:2: (iv_ruleState= ruleState EOF )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:352:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState694);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState704); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:359:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) otherlv_5= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_actions_2_0 = null;

        EObject lv_actions_3_0 = null;

        EObject lv_transition_4_0 = null;


         enterRule(); 
            
        try {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:362:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) otherlv_5= '}' ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:363:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) otherlv_5= '}' )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:363:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) otherlv_5= '}' )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:363:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) otherlv_5= '}'
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:363:2: ( (lv_name_0_0= ruleEString ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:364:1: (lv_name_0_0= ruleEString )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:364:1: (lv_name_0_0= ruleEString )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:365:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState750);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleState762); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1());
                
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:385:1: ( (lv_actions_2_0= ruleAction ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:386:1: (lv_actions_2_0= ruleAction )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:386:1: (lv_actions_2_0= ruleAction )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:387:3: lv_actions_2_0= ruleAction
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleState783);
            lv_actions_2_0=ruleAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateRule());
            	        }
                   		add(
                   			current, 
                   			"actions",
                    		lv_actions_2_0, 
                    		"Action");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:403:2: ( (lv_actions_3_0= ruleAction ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:404:1: (lv_actions_3_0= ruleAction )
            	    {
            	    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:404:1: (lv_actions_3_0= ruleAction )
            	    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:405:3: lv_actions_3_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleState804);
            	    lv_actions_3_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_3_0, 
            	            		"Action");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:421:3: ( (lv_transition_4_0= ruleTransition ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:422:1: (lv_transition_4_0= ruleTransition )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:422:1: (lv_transition_4_0= ruleTransition )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:423:3: lv_transition_4_0= ruleTransition
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getTransitionTransitionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleState826);
            lv_transition_4_0=ruleTransition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateRule());
            	        }
                   		set(
                   			current, 
                   			"transition",
                    		lv_transition_4_0, 
                    		"Transition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleState838); 

                	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleEInt"
    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:451:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:452:2: (iv_ruleEInt= ruleEInt EOF )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:453:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt875);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt886); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:460:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:463:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:464:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:464:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:464:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:464:2: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:465:2: kw= '-'
                    {
                    kw=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEInt925); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt942); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleSensor"
    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:485:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:486:2: (iv_ruleSensor= ruleSensor EOF )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:487:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSensor_in_entryRuleSensor987);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSensor997); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:494:1: ruleSensor returns [EObject current=null] : ( () otherlv_1= 'sensor' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:497:28: ( ( () otherlv_1= 'sensor' ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:498:1: ( () otherlv_1= 'sensor' )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:498:1: ( () otherlv_1= 'sensor' )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:498:2: () otherlv_1= 'sensor'
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:498:2: ()
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:499:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSensorAccess().getSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSensor1043); 

                	newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActuator"
    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:516:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:517:2: (iv_ruleActuator= ruleActuator EOF )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:518:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActuator_in_entryRuleActuator1079);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActuator1089); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:525:1: ruleActuator returns [EObject current=null] : ( () otherlv_1= 'actuator' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:528:28: ( ( () otherlv_1= 'actuator' ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:529:1: ( () otherlv_1= 'actuator' )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:529:1: ( () otherlv_1= 'actuator' )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:529:2: () otherlv_1= 'actuator'
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:529:2: ()
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:530:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActuatorAccess().getActuatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleActuator1135); 

                	newLeafNode(otherlv_1, grammarAccess.getActuatorAccess().getActuatorKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleAction"
    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:547:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:548:2: (iv_ruleAction= ruleAction EOF )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:549:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction1171);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction1181); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:556:1: ruleAction returns [EObject current=null] : (otherlv_0= 'set' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:559:28: ( (otherlv_0= 'set' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:560:1: (otherlv_0= 'set' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:560:1: (otherlv_0= 'set' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:560:3: otherlv_0= 'set' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) )
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAction1218); 

                	newLeafNode(otherlv_0, grammarAccess.getActionAccess().getSetKeyword_0());
                
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:564:1: ( ( ruleEString ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:565:1: ( ruleEString )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:565:1: ( ruleEString )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:566:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction1241);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAction1253); 

                	newLeafNode(otherlv_2, grammarAccess.getActionAccess().getToKeyword_2());
                
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:583:1: ( (lv_value_3_0= ruleSignal ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:584:1: (lv_value_3_0= ruleSignal )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:584:1: (lv_value_3_0= ruleSignal )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:585:3: lv_value_3_0= ruleSignal
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getValueSignalEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSignal_in_ruleAction1274);
            lv_value_3_0=ruleSignal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"Signal");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTransition"
    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:609:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:610:2: (iv_ruleTransition= ruleTransition EOF )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:611:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition1310);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition1320); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:618:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'if' ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSignal ) ) otherlv_4= 'move to' ( ( ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:621:28: ( (otherlv_0= 'if' ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSignal ) ) otherlv_4= 'move to' ( ( ruleEString ) ) ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:622:1: (otherlv_0= 'if' ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSignal ) ) otherlv_4= 'move to' ( ( ruleEString ) ) )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:622:1: (otherlv_0= 'if' ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSignal ) ) otherlv_4= 'move to' ( ( ruleEString ) ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:622:3: otherlv_0= 'if' ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSignal ) ) otherlv_4= 'move to' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTransition1357); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getIfKeyword_0());
                
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:626:1: ( ( ruleEString ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:627:1: ( ruleEString )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:627:1: ( ruleEString )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:628:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getSensorSensorCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition1380);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTransition1392); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getIsKeyword_2());
                
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:645:1: ( (lv_value_3_0= ruleSignal ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:646:1: (lv_value_3_0= ruleSignal )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:646:1: (lv_value_3_0= ruleSignal )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:647:3: lv_value_3_0= ruleSignal
            {
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getValueSignalEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSignal_in_ruleTransition1413);
            lv_value_3_0=ruleSignal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransitionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"Signal");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTransition1425); 

                	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getMoveToKeyword_4());
                
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:667:1: ( ( ruleEString ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:668:1: ( ruleEString )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:668:1: ( ruleEString )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:669:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getNextStateCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition1448);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "ruleSignal"
    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:690:1: ruleSignal returns [Enumerator current=null] : ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'low' ) ) ;
    public final Enumerator ruleSignal() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:692:28: ( ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'low' ) ) )
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:693:1: ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'low' ) )
            {
            // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:693:1: ( (enumLiteral_0= 'high' ) | (enumLiteral_1= 'low' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:693:2: (enumLiteral_0= 'high' )
                    {
                    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:693:2: (enumLiteral_0= 'high' )
                    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:693:4: enumLiteral_0= 'high'
                    {
                    enumLiteral_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSignal1498); 

                            current = grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:699:6: (enumLiteral_1= 'low' )
                    {
                    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:699:6: (enumLiteral_1= 'low' )
                    // ../arduinoML.concretesyntax/src-gen/arduinoML/concretesyntax/parser/antlr/internal/InternalArduinoML.g:699:8: enumLiteral_1= 'low'
                    {
                    enumLiteral_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSignal1515); 

                            current = grammarAccess.getSignalAccess().getLOWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSignalAccess().getLOWEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignal"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleApp_in_entryRuleApp75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleApp85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleApp122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleApp143 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleApp155 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleApp178 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleApp190 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleApp202 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleApp214 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_ruleBrick_in_ruleApp235 = new BitSet(new long[]{0x0000000000188000L});
        public static final BitSet FOLLOW_ruleBrick_in_ruleApp256 = new BitSet(new long[]{0x0000000000188000L});
        public static final BitSet FOLLOW_15_in_ruleApp269 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleApp281 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleApp293 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleState_in_ruleApp314 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_ruleState_in_ruleApp335 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_15_in_ruleApp348 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleApp360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBrick_in_entryRuleBrick396 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBrick406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleBrick454 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleBrick481 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBrick502 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleBrick514 = new BitSet(new long[]{0x0000000000040040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBrick535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString572 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState694 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState750 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleState762 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleState783 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleState804 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleState826 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleState838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt875 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleEInt925 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensor_in_entryRuleSensor987 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSensor997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleSensor1043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActuator_in_entryRuleActuator1079 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActuator1089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleActuator1135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1171 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction1181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleAction1218 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction1241 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleAction1253 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_ruleSignal_in_ruleAction1274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition1310 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition1320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleTransition1357 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition1380 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleTransition1392 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_ruleSignal_in_ruleTransition1413 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleTransition1425 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleSignal1498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleSignal1515 = new BitSet(new long[]{0x0000000000000002L});
    }


}