require 'ruble'

project_template t(:basic_web_template_name) do |t|
  t.type = :web
  t.tags = ['Web']
  t.id = "com.aptana.project.template.web.basic"
  t.location = "templates/basic_web_template.zip"
  t.description = t(:basic_web_template_desc)
  t.replace_parameters = false
  t.tags = ['Web']
  t.priority = 1
end

project_template t('Hello HBuilder') do |t|
  t.type = :web
  t.tags = ['Web']
  t.icon = "templates/window4848.png"
  t.id = "com.aptana.project.template.web.html5.hellohbuilder"
  t.location = "templates/HelloHBuilder.zip"
  t.description = t(:'该项目可以让你快速了解HBuilder，试一下吧！')
  t.replace_parameters = false
  t.tags = ['Web']
  t.priority = 3
end

project_template t('微信项目') do |t|
  t.type = :web
  t.tags = ['Web']
  t.icon = "templates/window4848.png"
  t.id = "com.aptana.project.template.web.html5.weixinproject"
  t.location = "templates/WeixinProject.zip"
  t.description = t(:'微信WEB App，使用此模板支持微信JS-SDK的提示')
  t.replace_parameters = false
  t.tags = ['Web']
  t.priority = 3
end
