
package generated;

import java.util.Map;

import org.w3c.dom.Element;

import ro.uaic.fmse.k2m.tag.Tag;

/**
 * @author andrei.arusoaie
 *
 */
public class RIGHT_right_TAG extends Tag {

	public RIGHT_right_TAG(Element element, Map<String, String> consMap) {
		super(element, consMap);
	}
	
	@Override
	public String toMaude() throws Exception {
		return processToMaudeAsSeparatedList(" ");
	}
}
