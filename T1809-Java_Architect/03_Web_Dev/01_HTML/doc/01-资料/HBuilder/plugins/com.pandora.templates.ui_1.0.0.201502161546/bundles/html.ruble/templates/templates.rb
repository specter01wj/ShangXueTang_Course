require 'ruble'

HTML_TEMPLATES = {
  'strict.html' => t(:html_4_strict),
  'transitional.html' => t(:html_4_transitional)
} unless defined?(HTML_TEMPLATES)

HTML_TEMPLATES.each do |filename, name|
  filetypes = ["*.html"]
  filetypes <<  "*.xhtml" if filename.end_with? ".xhtml"
  filetypes.each do |filetype|
    template t(:html_file_template_name, :name => name, :filetype => filetype) do |t|
      t.filetype = filetype
      t.location = "templates/#{filename}"
    end
  end
end

template t("HTML5 Template") do |t|
  t.filetype = "*.html"
  t.location = "templates/html5.html"
end

template t("HTML5⁺ Template") do |t|
  t.filetype = "*.html"
  t.location = "templates/html5plus.html"
end