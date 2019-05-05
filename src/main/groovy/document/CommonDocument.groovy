package document

import groovy.xml.MarkupBuilder

class CommonDocument {

    def name
    def toolBarElement = [
            "页面": ["页标题"],
            "面板"    : ["控制器_面板", "面板标题"],
            "标签"      : ["控制器_标签", "标签标题"],
            "标签页" : ["控制器_标签页", "标签页标题", "标签名称(以逗号分隔)"],
            "树形结构" : ["控制器_树形结构", "树形结构名称"]
    ]

    def createGsp(params) {
        println("传入参数：${params}")
        def strXml = new StringWriter()
        MarkupBuilder mb = new groovy.xml.MarkupBuilder(strXml);
        mb.setExpandEmptyElements(true) //扩展空的元素
        mb.setDoubleQuotes(true)    //采用双引号

        def key = params.keySet()[0]
        println("${key}")
        switch (key) {
            case "页面":
                break
            case "面板":
                break
            case "标签":
                break
            case "标签页":
                break
            case "树形结构":
                break
        }

        return strXml.toString()
    }

    def createJs(params) {

        def key = params.keySet()[0]
        println("${key}")
        switch (key) {
            case "页面":
                break
            case "面板":
                break
            case "标签":
                break
            case "标签页":
                break
            case "树形结构":
                break
        }

        def tempFile = new File("jsTemplate4Panel.txt")

        def engine = new groovy.text.SimpleTemplateEngine()
        def template = engine.createTemplate(tempFile.text)
        def jsText = template.make([
                domainName: panelText,
                controller: "operation4${panelText}"
        ])

        return jsText
    }

    /*
    构造函数
    * */

    def CommonDocument(str) {
        name = str
    }
}
